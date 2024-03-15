package GameClasses;

import GameMechanics.GameConsole;
import GameMechanics.Mechanics;

import javax.swing.*;

public class  Contestant {

    public  String name;
    public  Double life;
    public  Integer skill;
    public  Integer strength;
    public  Integer magicka;

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

    public Integer strRoll() {
        Integer dice = Mechanics.dice();
        Integer roll = this.strength + dice;
        GameConsole.warningSetter("D10: " + dice + " Total:" + roll);
        return roll;
    }

    public Integer sklRoll() {
        Integer dice = Mechanics.dice();
        Integer roll = this.skill + dice;
        GameConsole.warningSetter("D10: " + dice + " Total:" + roll);
        return roll;
    }

    public void  useMagicka(){
        this.magicka --;
        GameConsole.warningSetter("Magicka -1");
    }

    public Integer magkRoll(){
        useMagicka();
        return 10 + this.skill + this.strength;

    }

    public void  mgkCure(){
        useMagicka();
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
