package GameClasses.Enemy;

import GameClasses.Contestant;
import Mechanics.Mechanics;

public class Enemy extends Contestant {

    private  Integer mgkCounter = 0;
    public Enemy() {
        this("Placement Zanas", 50.0, 2, 8, 3, 0);
    }

    public Enemy(String name, Double life, Integer strength,
                 Integer skill, Integer magicka, Integer mgkC) {
        super(name, life, strength, skill, magicka);
        this.mgkCounter = mgkC;
    }

    public void countMgk(){
        this.mgkCounter ++;
    }

    public Integer statusCheck() {
        // 1 to str>skl, 2 to skl>str, 3 to str = skl
        Integer situation;
        if (this.strength > this.skill) {
            situation = 1;
        }
        if (this.skill > this.strength) {
            situation = 2;
        } else {
            situation = 3;
        }
        return situation;
    }

    public Boolean mgkChance() {
        boolean chance = false;
        if (mgkCounter %2 ==0) {
            if (this.magicka != 0) {
                if (this.life <= 10) {
                    chance = true;
                }
                if (this.life <= 30 && Mechanics.dice() <= 8) {
                    chance = true;
                } else if (Mechanics.dice() <= 3) {
                    chance = true;
                }
            }
        }
        return chance;
    }

    public Integer mgkChoice() {
        //1 to cure + turn, 2 to mgkroll, 3 to no magk
        int choice;
        boolean chance = mgkChance();

        if (chance) {
            if (this.life <= 10) {
                choice = 1;
            }
            if (this.life <= 30 && Mechanics.dice() <= 7) {
                choice = 1;
            }
            if (Mechanics.dice() <= 3) {
                choice = 1;
            } else {
                choice = 2;
            }
        } else {
            choice = 3;
        }
        return choice;
    }


    public Integer enemyActionRoll() {
        Integer rollValue;
        Integer dice = Mechanics.dice();
        switch (statusCheck()){
            case 1:
                if (dice >= 4){
                    rollValue = this.strRoll();
                }else{rollValue = this.sklRoll();}
                break;
            case 2:
                if (dice >= 4){
                    rollValue = this.sklRoll();
                }else{rollValue = this.strRoll();}
                break;
            default:
                if (dice >= 6){
                    rollValue = this.strRoll();
                }else{rollValue = this.sklRoll();}
                break;
        }
        return rollValue;
    }

    public Integer mgkUsage() {
        Integer rollValue;
        switch (mgkChoice()) {
            case 1:
                System.out.println("Inimigo se curou");
                this.mgkCure();
                countMgk();
                System.out.println("Enemy mgkCounter: " + this.mgkCounter);
                rollValue =  this.enemyActionRoll();

                break;
            case 2:
                System.out.println("Inimigo usou MgkRoll");
                countMgk();
                System.out.println("Enemy mgkCounter: " + this.mgkCounter);
                rollValue = this.magkRoll();
                break;
            default:
                rollValue = enemyActionRoll();
                break;

        }

        return rollValue;
    }


    public Integer enemyRoll() {
        Integer rollValue;
        System.out.println("Ação Inimiga");
        rollValue = this.mgkUsage();
            countMgk();
            System.out.println("Enemy mgkCounter: " + this.mgkCounter);
        System.out.println("Ataque Inimigo total: " + rollValue);
        return rollValue;
    }


}
