package GameClasses.Hero;

import GameClasses.Contestant;

import javax.swing.*;

public class Hero extends Contestant {
        public static String hName;

    public void setName(){
        hName = JOptionPane.showInputDialog("Seu Nome:");
    }

    public Hero(String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType){
        super(name,life, strength,skill,magicka,atkType);
        setName();
        this.name = hName;
        this.life = life;
        this.strength = strength;
        this.skill = skill;
        this.magicka = magicka;
        this.setCurrentAtkType(atkType);

    }

    public  Integer heroActionSelect(){
        // 1 to strRoll, 2 to sklRoll, 3 to MgkRoll, 4 to cure
        Integer selected;
            if (this.magicka == 0) {
             selected  = Integer.parseInt(JOptionPane.showInputDialog("Selecione sua Ação: 1 para Str | 2 para Skl"));
                if (selected > 2){
                    JOptionPane.showMessageDialog(null, "Sua magicka acabou!!");
                    selected  = Integer.parseInt(JOptionPane.showInputDialog("Selecione sua Ação: 1 para Str | 2 para Skl"));
                }if (selected > 2){ JOptionPane.showMessageDialog(null, "Teimoso vai jogar com Str!!");
                    selected = 1;
                }
            }else {
                selected  = Integer.parseInt(JOptionPane.showInputDialog("Selecione sua Ação: 1 para Str | 2 para Skl | 3 para Mgk | 4 para cura"));
            }
        return selected;
    }
    public Integer heroRoll(){
        Integer rollValue;
        System.out.println("Sua Ação");
        this.setCurrentAtkType(0);
        switch (heroActionSelect()){
            case 1:
               rollValue =  this.strRoll();
               this.setCurrentAtkType(1);
                break;
            case 2:
               rollValue =  this.sklRoll();
                this.setCurrentAtkType(2);
                break;
            case 3:
                System.out.println("Você usou MgkRoll!");
                rollValue = this.magkRoll();
                this.setCurrentAtkType(0);
                break;
            case 4:
                System.out.println("Você se curou!");
                this.mgkCure();
                    Integer turnSelc = Integer.parseInt(JOptionPane.showInputDialog("Selecione sua Ação: 1 para Str | 2 para SKl"));
                if (turnSelc == 1 ){
                    rollValue = this.strRoll();
                    this.setCurrentAtkType(1);
                }else {
                    rollValue = this.sklRoll();
                    this.setCurrentAtkType(2);
                }
                break;
            default:
                rollValue = this.strRoll();
                this.setCurrentAtkType(1);
                break;
        }
        System.out.println("Sua Ação total: " + rollValue);
        return rollValue;
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