package GameClasses.Enemy;

import GameClasses.Contestant;
import GameGUI.InterfaceMechanics.BattleInterfaceMechanics;
import GameGUI.TowerBattleGUI;
import GameMechanics.DelayGambi;
import GameMechanics.GameConsole;
import GameMechanics.Mechanics;

public class Enemy extends Contestant {

    private  Integer mgkCounter = 0;
    public Enemy() {
        this("Placement Zanas", 50.0, 2, 8, 3, 0,0);
    }

    public Enemy(String name, Double life, Integer strength,
                 Integer skill, Integer magicka, Integer atkTyp, Integer mgkC) {
        super(name, life, strength, skill, magicka, atkTyp);
        this.mgkCounter = mgkC;
    }
    @Override
    public void  useMagicka(){
    this.magicka --;
    }
    @Override
    public Integer strRoll() {
        Mechanics.enemyImgSetter(TowerBattleGUI.frame,"/enemy/wizard/wizardAttack.gif");
        Integer dice = Mechanics.dice();
        return this.strength + dice;
    }
    @Override
    public Integer sklRoll() {
        Mechanics.enemyImgSetter(TowerBattleGUI.frame,"/enemy/wizard/wizardAttack.gif");
        Integer dice = Mechanics.dice();
        return this.skill + dice;
    }
    @Override
    public void  mgkCure(){
        Mechanics.enemyImgSetter(TowerBattleGUI.frame,"/enemy/wizard/wizardHeal.gif");
        useMagicka();
        this.life = this.life + 10;
        BattleInterfaceMechanics.updateEnemyLife(this.life);
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

    public  Integer enemyActionSelect(){
        //1 to str, 2 to skll
        Integer selected;
        Integer dice = Mechanics.dice();
        switch (statusCheck()){
            case 1:
                if (dice >= 4){
                    selected = 1;
                }else{selected = 2;}
                break;
            case 2:
                if (dice >= 4){
                    selected = 2;
                }else{selected = 1;}
                break;
            default:
                if (dice >= 6){
                    selected = 1;
                }else{selected = 2;}
                break;
        }
        return selected;
    }


    public Integer enemyActionRoll() {
        Integer rollValue;
        Integer i = enemyActionSelect();
        if (i == 1) {
            rollValue = this.strRoll();
            this.setCurrentAtkType(1);
        } else if (i == 2) {
            rollValue = this.sklRoll();
            this.setCurrentAtkType(2);
        } else {
            throw new IllegalStateException("Unexpected value: " + enemyActionSelect());
        }
        return rollValue;
    }

    public Integer mgkUsage() {
        Integer rollValue;
        switch (mgkChoice()) {
            case 1:
                Mechanics.enemyImgSetter(TowerBattleGUI.frame,"/enemy/wizard/wizardHeal.gif");
                DelayGambi.delay(1500);
                GameConsole.warningSetter("They Healed ");
                this.mgkCure();
                countMgk();
                rollValue =  this.enemyActionRoll();

                break;
            case 2:
                Mechanics.enemyImgSetter(TowerBattleGUI.frame,"/enemy/wizard/wizardMgk.gif");
                countMgk();
                rollValue = this.magkRoll();
                this.setCurrentAtkType(0);
                break;
            default:
                rollValue = enemyActionRoll();
                break;

        }

        return rollValue;
    }


    public Integer enemyRoll() {
        Integer rollValue;
        this.setCurrentAtkType(0);
        rollValue = this.mgkUsage();
            countMgk();
        GameConsole.warningSetter("Enemy Action: " + rollValue);
        return rollValue;
    }


}
