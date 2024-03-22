package GameMechanics;

import GameClasses.Enemy.Enemy;
import GameClasses.Hero.Hero;
import GameGUI.BattleScreen;
import GameGUI.HeroCreationScreen;
import GameGUI.InterfaceMechanics.BattleInterfaceMechanics;
import GameGUI.InterfaceMechanics.HeroCreateMechanics;
import GameGUI.TitleScreen;
import GameGUI.UiHandler;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import static GameMechanics.Battle.*;

public class Tower {

    private static String gameState = "title";

    public static void setGameState(String state){
        gameState = state;
    }
    private static Integer towerRestart = 0;

    public static void setTowerRestart(Integer value) {
        towerRestart = value;
    }

    private static Hero[] myHero = new Hero[1];
    private static Enemy[] myEnemy = new Enemy[1];

    static TitleScreen ts = new TitleScreen();
    static BattleScreen bs = new BattleScreen();
    static HeroCreationScreen hcs = new HeroCreationScreen();

    static JFrame gameFrame = new JFrame();

    public static void towerInit() {
        //Initializing Objects
        gameFrame = new JFrame();
        ts = new TitleScreen();
        hcs = new HeroCreationScreen();
        bs = new BattleScreen();
        java.util.Timer timer = new Timer();
        SwingUtilities.invokeLater(() -> {
            gameFrame.setTitle("ToZ Alpha");
            gameFrame.setSize(1100, 940);
            gameFrame.setLocationRelativeTo(null);
            gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Set the initial content pane to the title screen
            gameFrame.setContentPane(UiHandler.titleFrame(ts));
            gameFrame.setVisible(true);

            // Start Button action listener
            ts.NgBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Tower.setGameState("start");

                    // Set the content pane to the hero creation screen
                    gameFrame.setContentPane(UiHandler.heroCreation(hcs));

                    // Repaint the frame to reflect the change
                    gameFrame.revalidate();
                    gameFrame.repaint();
                }});

        });
        myHero[0] = Mechanics.myHero();
        while(gameState != "battle"){
            DelayGambi.delay(10);
        }
        gameFrame.setContentPane(UiHandler.battleFrame(bs));
        myEnemy[0] = Mechanics.myEnemy();
        JOptionPane.showMessageDialog(bs, "Strength vs Strength -> Damage is the difference | Any Other clash, damage is set to 10 | When you heal, you can attack after normally | MgkRoll add + 10 on your roll");
        //Initializing contestants gui
        SwingUtilities.invokeLater(() -> {
            bs.updateGui
                    (bs, myHero[0].life, myHero[0].strength, myHero[0].skill, myHero[0].magicka,
                            myEnemy[0].life, myEnemy[0].strength, myEnemy[0].skill, myEnemy[0].magicka,
                            getTurnCounter());
            Mechanics.heroImgSetter(bs, myHero[0].animations[3]);
            Mechanics.enemyImgSetter(bs, myEnemy[0].animations[3]);
        });

        //restarting logic
        bs.RESTARTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(bs, "Game Restarted");
                GameConsole.warningSetter(bs, "game restarted");
                myHero[0].setAsDefaultValues();
                myEnemy[0].setAsDefaultValues();
                setTurnCounter(0);
                SwingUtilities.invokeLater(() -> {
                    BattleScreen.updateGui
                            (bs, myHero[0].life, myHero[0].strength, myHero[0].skill, myHero[0].magicka,
                                    myEnemy[0].life, myEnemy[0].strength, myEnemy[0].skill, myEnemy[0].magicka,
                                    getTurnCounter());
                    Mechanics.heroImgSetter(bs, myHero[0].animations[3]);
                    Mechanics.enemyImgSetter(bs, myEnemy[0].animations[3]);
                });
            }
        });
        //making sure is thread safe
        SwingUtilities.invokeLater(() -> {
            bs.updateNames(bs, myHero[0].name, myEnemy[0].name);
            //First GUI update
            BattleScreen.updateGui
                    (bs, myHero[0].life, myHero[0].strength, myHero[0].skill, myHero[0].magicka, myEnemy[0].life, myEnemy[0].strength, myEnemy[0].skill, myEnemy[0].magicka, getTurnCounter());
        });
        //Actual game Logic
        setTowerRestart(0);
        for (int i = 0; i <= Mechanics.getEnemyList().length -1 ; i++) {
            towerBattle(bs);
            Battle.setBattleOver(false);
            //LevelUp
            Mechanics.levelUp(myHero[0]);
            //Next Opponent
            myEnemy[0] = Mechanics.myEnemy();
            //Reupdating GUI
            SwingUtilities.invokeLater(() -> {
                bs.updateNames(bs, myHero[0].name, myEnemy[0].name);
                //reseting Hero stats
                myHero[0].life = myHero[0].defaultLife; myHero[0].strength = myHero[0].defaultStrength;
                myHero[0].skill = myHero[0].defaultSkill; myHero[0].magicka = myHero[0].defaultMagicka;
                bs.updateGui
                        (bs, myHero[0].life, myHero[0].strength, myHero[0].skill, myHero[0].magicka,
                                myEnemy[0].life, myEnemy[0].strength, myEnemy[0].skill, myEnemy[0].magicka,
                                getTurnCounter());
                setTurnCounter(0);
                Mechanics.heroImgSetter(bs, myHero[0].animations[3]);
                Mechanics.enemyImgSetter(bs, myEnemy[0].animations[3]);
            });
        }


    }


    public static void towerBattle(BattleScreen gameFrame) {
        while (gameOver(gameFrame, myHero[0], myEnemy[0], turnCounter) != true) {
            clash(gameFrame, myHero[0], myEnemy[0]);
            countTurn();
            SwingUtilities.invokeLater(() -> {
                BattleScreen.updateGui
                        (gameFrame, myHero[0].life, myHero[0].strength, myHero[0].skill, myHero[0].magicka, myEnemy[0].life, myEnemy[0].strength, myEnemy[0].skill, myEnemy[0].magicka, getTurnCounter());
                Mechanics.heroImgSetter(gameFrame, myHero[0].animations[4]);
                Mechanics.enemyImgSetter(gameFrame, myEnemy[0].animations[4]);
            });
        }
    }

    public static void main(String[] args){
        towerInit();
    }


}
