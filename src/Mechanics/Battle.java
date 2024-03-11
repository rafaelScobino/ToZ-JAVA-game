package Mechanics;

import GameClasses.Contestant;
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
        switch (turnSelector()) {
            case 'e':
                if (hero.heroRoll() > enemy.enemyRoll()) {
                    enemy.life = enemy.life - 10.0;
                } else {
                    System.out.println("Você errou ou foi defendido");
                }
                break;
            case 'o':
                if (enemy.enemyRoll() > hero.heroRoll()) {
                    hero.life = hero.life - 10.0;
                } else {
                    System.out.println("Você esquivou ou defendeu");
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
            clash( myHero, myEnemy);
            gameOver(myHero, myEnemy, turnCounter);
            countTurn();
            System.out.println(" ");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        }


    }


}
