package GameMechanics;

import GameClasses.Enemy.Enemy;
import GameClasses.Hero.Hero;
import GameGUI.TowerBattleGUI;

import javax.swing.*;

import static GameMechanics.Battle.*;

public class Tower {

    public static Integer towerRestart = 0;

    public static Integer getTowerRestart() {
        return towerRestart;
    }

    public static void setTowerRestart(Integer towerRestart) {
        Tower.towerRestart = towerRestart;
    }

    public  static void towerInit(){
        //Initializing Objects
        TowerBattleGUI.guiInit();
        JOptionPane.showMessageDialog(TowerBattleGUI.frame,"Strength vs Strength -> Damage is the difference | Any Other clash, damage is set to 10 | When you heal, you can attack after normally | MgkRoll add + 10 on your roll");
        Hero myHero = Mechanics.myHero();
        Enemy myEnemy = Mechanics.myEnemy();
        //making sure is thread safe
        javax.swing.SwingUtilities.invokeLater(() -> {TowerBattleGUI.updateNames(myHero.name, myEnemy.name);
            //First GUI update
            TowerBattleGUI.updateGui
                    (myHero.life,myHero.strength,myHero.skill,myHero.magicka,myEnemy.life,myEnemy.strength,myEnemy.skill,myEnemy.magicka, Battle.getTurnCounter());});
        //Actual game Logic
        for (int i = 0; i <= 21; i++) {
            clash (myHero,myEnemy);
            gameOver(myHero, myEnemy, turnCounter);
            countTurn();
            javax.swing.SwingUtilities.invokeLater(() -> {
                TowerBattleGUI.updateGui
                        (myHero.life,myHero.strength,myHero.skill,myHero.magicka,myEnemy.life,myEnemy.strength,myEnemy.skill,myEnemy.magicka, Battle.getTurnCounter());
                Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerRun.gif");
                Mechanics.enemyImgSetter(TowerBattleGUI.frame,"/enemy/wizard/wizardRun.gif");
            });
        }

    }

    public static void main(String[] args) {
        //Initializing Objects
        TowerBattleGUI.guiInit();
        JOptionPane.showConfirmDialog(TowerBattleGUI.frame,"Strength vs Strength -> Damage is de difference | Any Other clash, damage is set to 10 | When you heal, you can attack after normally | MgkRoll add + 10 on your roll");
        Hero myHero = Mechanics.myHero();
        Enemy myEnemy = Mechanics.myEnemy();
        //making sure is thread safe
        javax.swing.SwingUtilities.invokeLater(() -> {TowerBattleGUI.updateNames(myHero.name, myEnemy.name);
        //First GUI update
            TowerBattleGUI.updateGui
                    (myHero.life,myHero.strength,myHero.skill,myHero.magicka,myEnemy.life,myEnemy.strength,myEnemy.skill,myEnemy.magicka, Battle.getTurnCounter());});
        //Actual game Logic
        for (int i = 0; i <= 21; i++) {
            clash (myHero,myEnemy);
            gameOver(myHero, myEnemy, turnCounter);
            countTurn();
            javax.swing.SwingUtilities.invokeLater(() -> {
                TowerBattleGUI.updateGui
                        (myHero.life,myHero.strength,myHero.skill,myHero.magicka,myEnemy.life,myEnemy.strength,myEnemy.skill,myEnemy.magicka, Battle.getTurnCounter());
                        Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerRun.gif");
                        Mechanics.enemyImgSetter(TowerBattleGUI.frame,"/enemy/wizard/wizardRun.gif");
            });
        }
    }

}
