package Mechanics;

import GameClasses.Contestant;
import GameClasses.Enemy.Enemy;
import GameClasses.Hero.*;

import javax.swing.*;

public class Mechanics {

    public static int dice(){
        return (int) (Math.random() * 11);
    }

    public static Hero myHero(){
        String selected = JOptionPane.showInputDialog("Sua classe");
        return switch (selected) {
            case "warrior" -> new Warrior();
            case "wizard" -> new Wizard();
            case "ranger" -> new Ranger();
            case "fighter" -> new Fighter();
            default -> new Custom();
        };
    }



    public static Enemy myEnemy(){
        return new Enemy();
    }
    public static void main(String[] args) {

    }
}

