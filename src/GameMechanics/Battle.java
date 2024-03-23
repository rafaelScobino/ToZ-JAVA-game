package GameMechanics;

import GameClasses.Enemy.Enemy;
import GameClasses.Hero.Hero;
import GameGUI.BattleScreenO;
import GameGUI.InterfaceMechanics.BattleInterfaceMechanics;

import javax.swing.*;

import java.awt.*;

import static GameGUI.InterfaceMechanics.BattleInterfaceMechanics.updateEsEnemyLife;
import static GameMechanics.DelayGambi.delay;


public class Battle {

    public static Integer turnCounter = 0;

    private static boolean battleOver = false;

    public static boolean isBattleOver() {
        return battleOver;
    }

    public static void setBattleOver(boolean bo) {
       battleOver = bo;
    }

    public static Integer getTurnCounter() {
        return turnCounter;
    }

    public static void setTurnCounter(Integer val){
        turnCounter = val;
    }

    public static void countTurn() {
        turnCounter++;
    }

//    public static char turnSelector() {
//        char turn;
//        if (turnCounter % 2 == 0) {
//            turn = 'e';
//            JOptionPane.showMessageDialog(null,"Attack Turn");
//        } else {
//            turn = 'o';
//            JOptionPane.showMessageDialog(null,"Defensive Turn");
//        }
//        return turn;
//    }
//    public static void eActionPeek(){
//        if (selected == 1 ){
//            JOptionPane.showMessageDialog(null,"Inimigo irá usar: Força ");
//        }else {
//            JOptionPane.showMessageDialog(null,"Inimigo irá usar: Skill");
//        }
//    }
//    public static void clash(Hero hero, Enemy enemy) {
//        char turn = turnSelector();
//        int yourRoll = hero.heroRoll();
//        int theirRoll = enemy.enemyRoll();
//        switch (turn) {
//            case 'e':
//                Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerAttack.gif");
//                if (hero.getCurrentAtkType() == 1 && enemy.getCurrentAtkType() ==1){
//                    if (yourRoll > theirRoll) {
//                        enemy.life = enemy.life - (yourRoll - theirRoll);
//                        JOptionPane.showMessageDialog(null,"Damage Dealt: " + (yourRoll - theirRoll) + " dmg"  );
//                    } else {
//                        Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerIdle.gif");
//                        JOptionPane.showMessageDialog(null,"You Miss or They defended");
//
//                    }
//                }else {
//                    if (yourRoll > theirRoll) {
//                        enemy.life = enemy.life - 10;
//                        JOptionPane.showMessageDialog(null,"Damage Dealt: 10 dmg");
//                    } else {
//                        Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerIdle.gif");
//                        JOptionPane.showMessageDialog(null,"You Miss or They defended");
//
//                    }
//                }
//                break;
//            case 'o':
//                if (hero.getCurrentAtkType() == 1 && enemy.getCurrentAtkType() ==1){
//                    if (theirRoll > yourRoll) {
//                        hero.life = hero.life - (theirRoll - yourRoll);
//                        Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerDamage.gif");
//                        JOptionPane.showMessageDialog(null,"They Dealt " + (theirRoll - yourRoll) + " damage" );
//
//                    } else {
//                        Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerIdle.gif");
//                        JOptionPane.showMessageDialog(null,"You Dodge or Defended");
//
//                    }
//                }else {
//                    if (theirRoll > yourRoll) {
//                        hero.life = hero.life - 10;
//                        Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerDamage.gif");
//                        JOptionPane.showMessageDialog(null,"They Dealt 10 damage " );
//
//                    } else {
//                        Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerIdle.gif");
//                        JOptionPane.showMessageDialog(null,"You Dodge or Defended");
//
//                    }
//                }
//                break;
//            default:
//                break;
//
//        }
//        javax.swing.SwingUtilities.invokeLater(() -> {
//            Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerRun.gif");
//            Mechanics.enemyImgSetter(TowerBattleGUI.frame,"/enemy/wizard/wizardRun.gif");
//        });
//    }

    public static void  clash(BattleScreenO tower, Hero hero, Enemy enemy) {
        GameConsole.warningSetter(tower,"______________________________________________");
        GameConsole.warningSetter(tower,"             Enemy Action:");
        GameConsole.warningSetter(tower,"----------------------------------------------");
        int theirRoll = enemy.enemyRoll(tower);
        GameConsole.warningSetter(tower,"______________________________________________");
        GameConsole.warningSetter(tower,"             Your Action");
        GameConsole.warningSetter(tower,"----------------------------------------------");
        int yourRoll = hero.heroRoll(tower);
        if (hero.getCurrentAtkType() == 1 || enemy.getCurrentAtkType() == 1) {
            if (yourRoll > theirRoll) {
                Mechanics.enemyImgSetter(tower, enemy.animations[5]);
                GameConsole.warningSetter(tower,"Damage Dealt: " + (yourRoll - theirRoll) + " dmg");
                MiscMechanics.enemyLifeDmg(tower);
                updateEsEnemyLife(tower,yourRoll,theirRoll, enemy.life);
                enemy.life = enemy.life - (yourRoll - theirRoll);
                delay(500);
            }
            if (yourRoll == theirRoll) {
                Mechanics.heroImgSetter(tower, hero.animations[3]);
                Mechanics.enemyImgSetter(tower, enemy.animations[3]);
                MiscMechanics.enemyOther(tower,"/tower/block.gif");
                MiscMechanics.heroOther(tower,"/tower/block.gif");
                GameConsole.warningSetter(tower,"You missed or They Defended");
                delay(1000);
            } else if (theirRoll > yourRoll) {
                Mechanics.heroImgSetter(tower, hero.animations[5]);
                GameConsole.warningSetter(tower,"Damage Received: " + (theirRoll - yourRoll) + " dmg");
                MiscMechanics.heroLifeDmg(tower);
                BattleInterfaceMechanics.updateEsHeroLife(tower,yourRoll,theirRoll, hero.life);
                hero.life = hero.life - (theirRoll - yourRoll);
                delay(500);
            }
        } else {
            if (yourRoll > theirRoll) {
                Mechanics.enemyImgSetter(tower, enemy.animations[5]);
                GameConsole.warningSetter(tower,"Damage Dealt: " + 10 + " dmg");
                MiscMechanics.enemyLifeDmg(tower);
                updateEsEnemyLife(tower,20,10, enemy.life);
                enemy.life = enemy.life - 10;
                delay(500);
            }
            if (yourRoll == theirRoll) {
                Mechanics.heroImgSetter(tower, hero.animations[3]);
                Mechanics.enemyImgSetter(tower, enemy.animations[3]);
                MiscMechanics.enemyOther(tower,"/tower/block.gif");
                MiscMechanics.heroOther(tower,"/tower/block.gif");
                GameConsole.warningSetter(tower,"You missed or They Defended");
                delay(1000);
            } else if (theirRoll > yourRoll) {
                Mechanics.heroImgSetter(tower, hero.animations[5]);
                GameConsole.warningSetter(tower,"Damage Received: " + 10 + " dmg");
                MiscMechanics.heroLifeDmg(tower);
                BattleInterfaceMechanics.updateEsHeroLife(tower,10,20, hero.life);
                hero.life = hero.life - 10;
                delay(500);
            }
        }

        javax.swing.SwingUtilities.invokeLater(() -> {
            Mechanics.heroImgSetter(tower, hero.animations[4]);
            Mechanics.enemyImgSetter(tower, enemy.animations[4]);
            tower.eMgkValue.setForeground(new Color(0,255,255));
            tower.hMgkValue.setForeground(new Color(0,255,255));
            MiscMechanics.diceReset(tower);
        });
    }

    public static boolean gameOver(BattleScreenO tower, Hero hero, Enemy enemy, Integer turn) {
        if (turn >= 30) {
            javax.swing.SwingUtilities.invokeLater(() -> {
                Mechanics.heroImgSetter(tower, hero.animations[7]);
                Mechanics.enemyImgSetter(tower, enemy.animations[7]);
            });
            System.exit(0);
            JOptionPane.showMessageDialog(tower, "Time Out");
            setBattleOver(true);
        }
        if (hero.life <= 0) {
            javax.swing.SwingUtilities.invokeLater(() -> {
                Mechanics.heroImgSetter(tower, hero.animations[7]);
                Mechanics.enemyImgSetter(tower, enemy.animations[6]);
            });
            JOptionPane.showMessageDialog(tower, "You Died");
            setBattleOver(true);
            System.exit(0);

        }
        if (enemy.life <= 0) {
            javax.swing.SwingUtilities.invokeLater(() -> {
                Mechanics.heroImgSetter(tower, hero.animations[6]);
                Mechanics.enemyImgSetter(tower, enemy.animations[7]);
            });
            JOptionPane.showMessageDialog(tower, "You Won");
            setBattleOver(true);
        }
        return isBattleOver();
    }

    public static void main(String[] args) {


    }


}
