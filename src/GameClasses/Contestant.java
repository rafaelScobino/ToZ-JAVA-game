package GameClasses;

import Mechanics.Mechanics;

public class  Contestant {

    public  String name;
    public  Double life;
    public  Integer skill;
    public  Integer strength;
    public  Integer magicka;

    public Contestant ( String name, Double life, Integer strength,
                 Integer skill, Integer magicka) {
        this.name = name;
        this.life = life;
        this.strength = strength;
        this.skill = skill;
        this.magicka = magicka;
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
        System.out.println("D10: " + dice + " Ataque: " + roll);
        return roll;
    }

    public Integer sklRoll() {
        Integer dice = Mechanics.dice();
        Integer roll = this.skill + dice;
        System.out.println("D10: " + dice + " Ataque: " + roll);
        return roll;
    }

    public void  useMagicka(){
        this.magicka --;
        System.out.println("Magicka Utilizada!! | Magicka - 1");
    }

    public Integer magkRoll(){
        useMagicka();
        return 100 + this.skill + this.strength;

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
    }





}
