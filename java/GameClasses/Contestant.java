package GameClasses;

import GameGUI.BattleScreen;
import GameMechanics.GameConsole;
import GameMechanics.Mechanics;
import GameMechanics.MiscMechanics;

import javax.swing.*;

public class  Contestant {

    public  String name;
    public  Double life;
    public  Integer skill;
    public  Integer strength;
    public  Integer magicka;

    public Double defaultLife;
    public Integer defaultSkill;
    public Integer defaultStrength;
    public Integer defaultMagicka;
    public void setAsDefaultValues(){
        this.life = this.defaultLife;
        this.strength = this.defaultStrength;
        this.skill = this.defaultSkill;
        this.magicka = this.defaultMagicka;
    }

    //1 to str , 2 to skl
    private Integer currentAtkType;

    public Contestant ( String name, Double life, Integer strength,
                 Integer skill, Integer magicka, Integer atkType) {
        this.name = name;
        this.life = life;
        this.strength = strength;
        this.skill = skill;
        this.magicka = magicka;
        this.currentAtkType = atkType;
        this.defaultLife = life;
        this.defaultStrength = strength;
        this.defaultSkill = skill;
        this.defaultMagicka = magicka;
    }

    public void setCurrentAtkType(Integer value){
        this.currentAtkType = value;
    }
    public Integer getCurrentAtkType(){
        return this.currentAtkType;
    }

    public void upStr(Integer value){
        this.strength = this.strength + value;
    }

    public void upSkl(Integer value){
        this.skill = this.skill + value;
    }

    public void upLife(Integer value){
        this.life = this.life + value;
    }


    public void upMgk(Integer value){
        this.magicka = this.magicka + value;
    }

    public Integer strRoll(BattleScreen tower) {
        Integer dice = Mechanics.dice();
        Integer roll = this.strength + dice;
        MiscMechanics.heroDice(tower,dice);
        GameConsole.warningSetter(tower,"D10: " + dice + " Total:" + roll);
        return roll;
    }

    public Integer sklRoll(BattleScreen tower) {
        Integer dice = Mechanics.dice();
        Integer roll = this.skill + dice;
        MiscMechanics.heroDice(tower,dice);
        GameConsole.warningSetter(tower,"D10: " + dice + " Total:" + roll);
        return roll;
    }

    public void  useMagicka(BattleScreen tower){
        this.magicka --;
        GameConsole.warningSetter(tower,"Magicka -1");
    }

    public Integer magkRoll(BattleScreen tower){
        useMagicka(tower);
        return 10 + this.skill + this.strength;

    }

    public void  mgkCure(BattleScreen tower){
        useMagicka(tower);
        this.life = this.life + 10;
    }

    public void showStats() {
        System.out.println(
                "Name: " + name + " | " +
                        "Life: " + life + " | " +
                        "Str: " + strength + " | " +
                        "Skl: " + skill + " | " +
                        "Mgk: " + magicka);
        JOptionPane.showMessageDialog(null,"Name: " + name + " | " +
                "Life: " + life + " | " +
                "Str: " + strength + " | " +
                "Skl: " + skill + " | " +
                "Mgk: " + magicka);
    }





}
