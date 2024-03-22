package GameClasses.Enemy;

import GameClasses.Contestant;
import GameGUI.InterfaceMechanics.BattleInterfaceMechanics;
import GameGUI.BattleScreen;
import GameMechanics.DelayGambi;
import GameMechanics.GameConsole;
import GameMechanics.Mechanics;
import GameMechanics.MiscMechanics;

import java.util.Timer;

public class Enemy extends Contestant {

    public String[] animations;
    // 0 -> Attack  1-> Heal  2-> MgkRoll  3->Idle  4->Run  5->Damage  6->Jump  7->Die
    private  Integer mgkCounter = 0;

    public Enemy(String name, Double life, Integer strength,
                 Integer skill, Integer magicka, Integer atkTyp,String[] gifs) {
        super(name, life, strength, skill, magicka, atkTyp);
        this.animations = gifs;

    }
    @Override
    public void  useMagicka(BattleScreen tower){
        tower.seteNextRoll("MgkRoll or Heal");
        this.magicka --;
    }
    @Override
    public Integer strRoll(BattleScreen tower) {
        Mechanics.enemyImgSetter(tower,animations[0]);
        Integer dice = Mechanics.dice();
        MiscMechanics.enemyDice(tower,dice);
        tower.seteNextRoll("Strength");
        return this.strength + dice;
    }
    @Override
    public Integer sklRoll(BattleScreen tower) {
        Mechanics.enemyImgSetter(tower,animations[0]);
        Integer dice = Mechanics.dice();
        MiscMechanics.enemyDice(tower,dice);
        tower.seteNextRoll("skill");
        return this.skill + dice;
    }
    @Override
    public void  mgkCure(BattleScreen tower){
        Mechanics.enemyImgSetter(tower,animations[1]);
        useMagicka(tower);
        this.life = this.life + 10;
        BattleInterfaceMechanics.updateEnemyLife(tower,this.life);
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


    public Integer enemyActionRoll(BattleScreen tower) {
        Integer rollValue;
        Integer i = enemyActionSelect();
        if (i == 1) {
            rollValue = this.strRoll(tower);
            this.setCurrentAtkType(1);
        } else if (i == 2) {
            rollValue = this.sklRoll(tower);
            this.setCurrentAtkType(2);
        } else {
            throw new IllegalStateException("Unexpected value: " + enemyActionSelect());
        }
        return rollValue;
    }

    public Integer mgkUsage(BattleScreen tower) {
        Integer rollValue;
        switch (mgkChoice()) {
            case 1:
                Mechanics.enemyImgSetter(tower,animations[1]);
                GameConsole.warningSetter(tower,"They Healed ");
                this.mgkCure(tower);
                countMgk();
                rollValue =  this.enemyActionRoll(tower);

                break;
            case 2:
                Mechanics.enemyImgSetter(tower,animations[2]);
                countMgk();
                rollValue = this.magkRoll(tower);
                this.setCurrentAtkType(0);
                break;
            default:
                rollValue = enemyActionRoll(tower);
                break;

        }

        return rollValue;
    }


    public Integer enemyRoll(BattleScreen tower) {
        Integer rollValue;
        this.setCurrentAtkType(0);
        rollValue = this.mgkUsage(tower);
            countMgk();
        GameConsole.warningSetter(tower,"Enemy Action: " + rollValue);
        return rollValue;
    }


}
