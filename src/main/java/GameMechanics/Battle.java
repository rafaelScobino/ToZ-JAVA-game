package GameMechanics;

import GameClasses.Enemy.Enemy;
import GameClasses.Hero.Hero;
import GameGUI.TowerBattleGUI;

import javax.swing.*;

public class Battle {

    public static Integer turnCounter = 0;

    public static Integer getTurnCounter() {
        return turnCounter;
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

    public static void clash(Hero hero, Enemy enemy) {
        GameConsole.warningSetter("Your Action");
        int yourRoll = hero.heroRoll();
        int theirRoll = enemy.enemyRoll();
        if (hero.getCurrentAtkType() == 1 && enemy.getCurrentAtkType() == 1) {
            if (yourRoll > theirRoll) {
                enemy.life = enemy.life - (yourRoll - theirRoll);
                Mechanics.enemyImgSetter(TowerBattleGUI.frame, "/enemy/wizard/wizardDamage.gif");
                JOptionPane.showMessageDialog(TowerBattleGUI.frame, "Damage Dealt: " + (yourRoll - theirRoll) + " dmg");
                GameConsole.warningSetter("Damage Dealt: " + (yourRoll - theirRoll) + " dmg");
            }
            if (yourRoll == theirRoll) {
                Mechanics.heroImgSetter(TowerBattleGUI.frame, "/hero/ranger/rangerIdle.gif");
                Mechanics.enemyImgSetter(TowerBattleGUI.frame, "/enemy/wizard/wizardIdle.gif");
                JOptionPane.showMessageDialog(TowerBattleGUI.frame, "Missed Or Defended");
                GameConsole.warningSetter("You missed or They Defended");
            } else if (theirRoll > yourRoll) {
                hero.life = hero.life - (theirRoll - yourRoll);
                Mechanics.heroImgSetter(TowerBattleGUI.frame, "/hero/ranger/rangerDamage.gif");
                JOptionPane.showMessageDialog(TowerBattleGUI.frame, "Damage Received: " + (yourRoll - theirRoll) + " dmg");
                GameConsole.warningSetter("Damage Dealt: " + (theirRoll - yourRoll) + " dmg");
            }
        } else {
            if (yourRoll > theirRoll) {
                enemy.life = enemy.life - 10;
                Mechanics.enemyImgSetter(TowerBattleGUI.frame, "/enemy/wizard/wizardDamage.gif");
                JOptionPane.showMessageDialog(TowerBattleGUI.frame, "Damage Dealt: " + 10 + " dmg");
                GameConsole.warningSetter("Damage Dealt: " + 10 + " dmg");
            }
            if (yourRoll == theirRoll) {
                Mechanics.heroImgSetter(TowerBattleGUI.frame, "/hero/ranger/rangerIdle.gif");
                Mechanics.enemyImgSetter(TowerBattleGUI.frame, "/enemy/wizard/wizardIdle.gif");
                JOptionPane.showMessageDialog(TowerBattleGUI.frame, "Missed Or Defended");
                GameConsole.warningSetter("You missed or They Defended");
            } else if (theirRoll > yourRoll) {
                hero.life = hero.life - 10;
                Mechanics.heroImgSetter(TowerBattleGUI.frame, "/hero/ranger/rangerDamage.gif");
                JOptionPane.showMessageDialog(TowerBattleGUI.frame, "Damage Received: " + 10 + " dmg");
                GameConsole.warningSetter("Damage Received: " + 10 + " dmg");
            }
        }

        javax.swing.SwingUtilities.invokeLater(() -> {
            Mechanics.heroImgSetter(TowerBattleGUI.frame, "/hero/ranger/rangerRun.gif");
            Mechanics.enemyImgSetter(TowerBattleGUI.frame, "/enemy/wizard/wizardRun.gif");
        });
    }

    public static void gameOver(Hero hero, Enemy enemy, Integer turn) {
        if (turn >= 20) {
            javax.swing.SwingUtilities.invokeLater(() -> {
                Mechanics.heroImgSetter(TowerBattleGUI.frame, "/hero/ranger/rangerDie.gif");
                Mechanics.enemyImgSetter(TowerBattleGUI.frame, "/enemy/wizard/wizardDie.gif");
            });
            JOptionPane.showMessageDialog(null, "Time Out");
            System.exit(0);
        }
        if (hero.life <= 0) {
            javax.swing.SwingUtilities.invokeLater(() -> {
                Mechanics.heroImgSetter(TowerBattleGUI.frame, "/hero/ranger/rangerDie.gif");
                Mechanics.enemyImgSetter(TowerBattleGUI.frame, "/enemy/wizard/wizardJump.gif");
            });
            JOptionPane.showMessageDialog(null, "You Died");
            System.exit(0);
        }
        if (enemy.life <= 0) {
            javax.swing.SwingUtilities.invokeLater(() -> {
                Mechanics.heroImgSetter(TowerBattleGUI.frame, "/hero/ranger/rangerJump.gif");
                Mechanics.enemyImgSetter(TowerBattleGUI.frame, "/enemy/wizard/wizardDie.gif");
            });
            JOptionPane.showMessageDialog(null, "You Won");
            System.exit(0);
        }
    }

    public static void main(String[] args) {


    }


}
