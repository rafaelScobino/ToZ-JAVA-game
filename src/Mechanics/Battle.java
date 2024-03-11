package Mechanics;

import GameClasses.Enemy.Enemy;
import GameClasses.Hero.Hero;

import javax.swing.*;

public class Battle {

    public static Integer turnCounter = 0;

    public static void countTurn() {
        turnCounter++;
    }

    public static char turnSelector() {
        char turn;
        if (turnCounter % 2 == 0) {
            turn = 'e';
            JOptionPane.showMessageDialog(null,"Selecione o seu ataque:");
        } else {
            turn = 'o';
            JOptionPane.showMessageDialog(null,"Selecione o sua defesa:");
        }
        return turn;
    }
    public static void clash( Hero hero, Enemy enemy) {
        int yourRoll = hero.heroRoll();
        int theirRoll = enemy.enemyRoll();
        switch (turnSelector()) {
            case 'e':
                if (hero.getCurrentAtkType() == 1 && enemy.getCurrentAtkType() ==1){
                    if (yourRoll > theirRoll) {
                        enemy.life = enemy.life - (yourRoll - theirRoll);
                    } else {
                        System.out.println("Você errou ou foi defendido");
                    }
                }else {
                    if (yourRoll > theirRoll) {
                        enemy.life = enemy.life - 10;
                    } else {
                        System.out.println("Você errou ou foi defendido");
                    }
                }
                break;
            case 'o':
                if (hero.getCurrentAtkType() == 1 && enemy.getCurrentAtkType() ==1){
                    if (theirRoll > yourRoll) {
                        hero.life = hero.life - (theirRoll - yourRoll);
                    } else {
                        System.out.println("Você desviou ou defendeu");
                    }
                }else {
                    if (theirRoll > yourRoll) {
                        hero.life = hero.life - 10;
                    } else {
                        System.out.println("Você desviou ou foi defendeu");
                    }
                }
                break;
            default:
                break;

        }
    }

    public static void gameOver(Hero hero, Enemy enemy, Integer turn) {
        if (turn >= 20) {
            System.out.println("Muito lerdo | Time Out");
            System.exit(0);
        }
        if (hero.life <= 0) {
            System.out.println("Você Morreu");
            System.exit(0);
        }
        if (enemy.life <= 0) {
            System.out.println("Você Venceu");
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        Hero myHero = Mechanics.myHero();
        Enemy myEnemy = Mechanics.myEnemy();
        System.out.println("Tower of Zanas ( in Java )");
        System.out.println("---------------------------------------------------");
        System.out.println(" ");
        for (int i = 0; i <= 21; i++) {
            System.out.println("Turno: " + turnCounter);
            myHero.showStats();
            myEnemy.showStats();
            clash( myHero , myEnemy );
            gameOver(myHero, myEnemy, turnCounter);
            countTurn();
            System.out.println(" ");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        }


    }


}
