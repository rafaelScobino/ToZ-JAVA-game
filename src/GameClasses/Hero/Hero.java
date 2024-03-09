package GameClasses.Hero;

import GameClasses.Contestant;

import javax.swing.*;

public class Hero extends Contestant {
        public static String hName;

    public void setName(){
        hName = JOptionPane.showInputDialog("Seu Nome:");
    }

    public Hero(String name, Double life, Integer strength, Integer skill, Integer magicka){
        super(name,life, strength,skill,magicka);
        setName();
        this.name = hName;
        this.life = life;
        this.strength = strength;
        this.skill = skill;
        this.magicka = magicka;

    }


    public static void main(String[] args) {
//
//        Hero rafaWa = new Warrior();
//        rafaWa.showStats();
//        System.out.println(rafaWa.strRoll());
//        System.out.println(rafaWa.sklRoll());
//        Hero rafaWiz = new Wizard();
//        rafaWiz.showStats();
//        System.out.println(rafaWiz.strRoll());
//        System.out.println(rafaWiz.sklRoll());
//        Hero rafaR = new Ranger();
//        rafaR.showStats();
//        System.out.println(rafaR.strRoll());
//        System.out.println(rafaR.sklRoll());
//        Hero rafaF = new Fighter();
//        rafaF.showStats();
//        System.out.println(rafaF.strRoll());
//        System.out.println(rafaF.sklRoll());
//        Hero rafaC = new Custom();
//        rafaC.showStats();
//        System.out.println(rafaF.strRoll());
//        System.out.println(rafaF.sklRoll());
    }

}