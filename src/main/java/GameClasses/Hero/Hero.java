package GameClasses.Hero;

import GameClasses.Contestant;
import GameGUI.InterfaceMechanics.BattleInterfaceMechanics;
import GameGUI.InterfaceMechanics.HeroCreateMechanics;
import GameGUI.TowerBattleGUI;
import GameMechanics.GameConsole;
import GameMechanics.Mechanics;

import javax.swing.*;

import static GameGUI.InterfaceMechanics.BattleInterfaceMechanics.gethActionSelected;
import static GameGUI.InterfaceMechanics.HeroCreateMechanics.*;

public class Hero extends Contestant {
        public static String hName;

    public void setName(){
        JOptionPane.showMessageDialog(null,"Name:");
        hName = getInputValue();
        HeroCreateMechanics.setInputNull();
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
                selected  = gethActionSelected();
                BattleInterfaceMechanics.sethActionNull();
                if (selected > 2){
                    JOptionPane.showMessageDialog(TowerBattleGUI.frame,"Your Magicka Is OVER");
                    GameConsole.warningSetter("Your Action: Str | Skl");
                    selected  = gethActionSelected();
                    BattleInterfaceMechanics.sethActionNull();;
                }if (selected > 2){
                    JOptionPane.showMessageDialog (TowerBattleGUI.frame,"Strength it is!!");
                    selected = 1;
                }
            }else {
                selected  = gethActionSelected();
                BattleInterfaceMechanics.sethActionNull();
            }
        return selected;
    }

    @Override
    public void  mgkCure(){
        useMagicka();
        this.life = this.life + 10;
        BattleInterfaceMechanics.updateHeroLife(this.life);
    }

    public Integer heroRoll(){
        Integer rollValue;
        this.setCurrentAtkType(0);
        switch (heroActionSelect()){
            case 1:
                Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerAttack.gif");
               rollValue =  this.strRoll();
               this.setCurrentAtkType(1);
                break;
            case 2:
                Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerAttack.gif");
               rollValue =  this.sklRoll();
                this.setCurrentAtkType(2);
                break;
            case 3:
                Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerMgk.gif");
//
                rollValue = this.magkRoll();
                this.setCurrentAtkType(0);
                break;
            case 4:
                Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerHeal.gif");
//                JOptionPane.showMessageDialog(null,"Heal!");
                this.mgkCure();
                JOptionPane.showMessageDialog(null,"Your Action: Str | Skl");
                    Integer turnSelect = gethActionSelected();
                BattleInterfaceMechanics.sethActionNull();
                if (turnSelect == 1 ){
                    Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerAttack.gif");
                    rollValue = this.strRoll();
                    this.setCurrentAtkType(1);
                }else {
                    Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerAttack.gif");
                    rollValue = this.sklRoll();
                    this.setCurrentAtkType(2);
                }
                break;
            default:
                Mechanics.heroImgSetter(TowerBattleGUI.frame,"/hero/ranger/rangerAttack.gif");
                rollValue = this.strRoll();
                this.setCurrentAtkType(1);
                break;
        }
//        JOptionPane.showMessageDialog(null,"Action Roll: " + rollValue);
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