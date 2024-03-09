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
        } else {
            turn = 'o';
        }
        return turn;
    }

    public static Integer actionSelector() {
        int action;
        if (turnSelector() == 'e') {
            action = Integer.parseInt(JOptionPane.showInputDialog("Selecione o seu ataque: 1 para str or 0 skl"));
        } else {
            action = Integer.parseInt(JOptionPane.showInputDialog("Selecione o sua defesa: 1 para str or 0 skl"));
        }
        return action;
    }

    public static Integer heroRoll(Integer selected, Hero hero) {
        Integer rollValue;
        System.out.println("Sua Ação:");
        switch (selected) {
            case 1:
                return rollValue = hero.strRoll();
            break;
            case 0:
                return rollValue = hero.sklRoll();
            break;
        }

    }

    public static Integer enemyRoll(Enemy enemy) {
        Integer rollValue;
        int selected;
        System.out.println("Ação Inimigo:");
        if (enemy.strength > enemy.skill) {
            selected = 0;
        } else {
            selected = 1;
        }
        switch (selected) {
            case 0:
                if (Mechanics.dice() < 7) {
                    rollValue = enemy.strRoll();
                } else {
                    rollValue = enemy.sklRoll();
                }
                break;
            case 1:
                if (Mechanics.dice() < 7) {
                    rollValue = enemy.sklRoll();
                } else {
                    rollValue = enemy.strRoll();
                }
                break;
            default:
                if (Mechanics.dice() < 5) {
                    rollValue = enemy.strRoll();
                } else {
                    rollValue = enemy.sklRoll();
                }
                break;
        }
        return rollValue;
    }

    public static void clash(char turn, Integer hRoll, Integer eRoll, Hero hero, Enemy enemy) {
        switch (turn) {
            case 'e':
                if (hRoll > eRoll) {
                    enemy.life = enemy.life - 10.0;
                } else {
                    System.out.println("Miss or Defended");
                }
                ;
                break;
            case 'o':
                if (eRoll > hRoll) {
                    hero.life = hero.life - 10.0;
                } else {
                    System.out.println("Miss or Defended");
                }
                ;
                break;
            default:
                break;

        }
    }

    public static void gameOver(Hero hero, Enemy enemy, Integer turn) {
        if (turn >= 20) {
            System.out.println("Muito lerdo | Time Out");
            System.exit(0);
        } else {
        }
        ;
        if (hero.life <= 0) {
            System.out.println("Você Morreu");
            System.exit(0);
        }
        if (enemy.life <= 0) {
            System.out.println("Você Venceu");
            System.exit(0);
        } else {
        }
        ;
    }

    public static void main(String[] args) {

        Hero myHero = Mechanics.myHero();
        myHero.showStats();
        Enemy myEnemy = Mechanics.myEnemy();
        myEnemy.showStats();
        System.out.println("Tower of Zanas ( in Java )");
        System.out.println("---------------------------------------------------");
        System.out.println(" ");
        for (int i = 0; i <= 21; i++) {
            System.out.println("Turno: " + turnCounter);
            myHero.showStats();
            myEnemy.showStats();
            clash(turnSelector(), heroRoll(actionSelector(), myHero), enemyRoll(myEnemy), myHero, myEnemy);
            gameOver(myHero, myEnemy, turnCounter);
            countTurn();
            System.out.println(" ");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
        }


    }


}
