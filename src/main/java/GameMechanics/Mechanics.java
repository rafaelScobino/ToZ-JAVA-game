package GameMechanics;

import GameClasses.Enemy.Enemy;
import GameClasses.Hero.*;
import GameGUI.InterfaceMechanics.HeroCreateMechanics;
import GameGUI.TowerBattleGUI;

import javax.swing.*;

import static GameGUI.InterfaceMechanics.HeroCreateMechanics.getInputValue;
import static GameGUI.InterfaceMechanics.HeroCreateMechanics.setInputValue;

public class Mechanics {

    public static int dice(){
        return (int) (Math.random() * 11);
    }

    public static Hero myHero(){
        JOptionPane.showMessageDialog(null,"Select your Class:");
        String selected = HeroCreateMechanics.getInputValue();
        HeroCreateMechanics.setInputNull();
        return switch (selected) {
            case "warrior" -> new Warrior();
            case "wizard" -> new Wizard();
            case "ranger" -> new Ranger();
            case "fighter" -> new Fighter();
            default -> new Custom();
        };
    }

    public static void heroImgSetter(TowerBattleGUI tower, String url){
        TowerBattleGUI.updateHeroImg(tower,url);

    }

//    public static void heroActionImgHandler (TowerBattleGUI tower,char turn,int heroRoll){
//        if (turn == "e") {
//            switch (heroRoll) {
//                case :
//                    heroImgSetter(tower, "/hero/ranger/rangerAttack.gif");
//            }
//        }
//    }

    public static void enemyImgSetter(TowerBattleGUI tower, String url){
        TowerBattleGUI.updateEnemyImg(tower,url);

    }
    public static Enemy myEnemy(){
        return new Enemy();
    }


    public static void main(String[] args) {

    }
}

