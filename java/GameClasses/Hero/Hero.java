package GameClasses.Hero;

import GameClasses.Contestant;
import GameGUI.InterfaceMechanics.BattleInterfaceMechanics;
import GameGUI.InterfaceMechanics.HeroCreateMechanics;
import GameGUI.BattleScreen;
import GameMechanics.GameConsole;
import GameMechanics.Mechanics;

import javax.swing.*;

import static GameGUI.InterfaceMechanics.BattleInterfaceMechanics.gethActionSelected;
import static GameGUI.InterfaceMechanics.HeroCreateMechanics.*;

public class Hero extends Contestant {
        public static String hName;
    public String[] animations;

    public void setName(){
        hName = getInputValue();
//        JOptionPane.showMessageDialog(null,"Tower Climb Started!! Good Luck");
    }

    public Hero(String name, Double life, Integer strength, Integer skill, Integer magicka, Integer atkType,String[] gifs){
        super(name,life, strength,skill,magicka,atkType);
        setName();
        this.name = hName;
        this.life = life;
        this.strength = strength;
        this.skill = skill;
        this.magicka = magicka;
        this.setCurrentAtkType(atkType);
        this.animations = gifs;
        this.defaultLife = life;
        this.defaultStrength = strength;
        this.defaultSkill = skill;
        this.defaultMagicka = magicka;
        this.setCurrentAtkType(atkType);

    }




    public  Integer heroActionSelect(BattleScreen tower){
        // 1 to strRoll, 2 to sklRoll, 3 to MgkRoll, 4 to cure
        Integer selected;
            if (this.magicka == 0) {
                selected  = gethActionSelected();
                BattleInterfaceMechanics.sethActionNull();
                if (selected > 2){
                    JOptionPane.showMessageDialog(tower,"Your Magicka Is OVER");
                    GameConsole.warningSetter(tower,"Your Action: Str | Skl");
                    selected  = gethActionSelected();
                    BattleInterfaceMechanics.sethActionNull();;
                }if (selected > 2){
                    JOptionPane.showMessageDialog (tower,"Strength it is!!");
                    selected = 1;
                }
            }else {
                selected  = gethActionSelected();
                BattleInterfaceMechanics.sethActionNull();
            }
        return selected;
    }

    @Override
    public void  mgkCure(BattleScreen tower){
        useMagicka(tower);
        this.life = this.life + 10;
        BattleInterfaceMechanics.updateHeroLife(tower,this.life);
    }

    public Integer heroRoll(BattleScreen tower){
        Integer rollValue;
        this.setCurrentAtkType(0);
        switch (heroActionSelect(tower)){
            case 1:
                Mechanics.heroImgSetter(tower,this.animations[0]);
               rollValue =  this.strRoll(tower);
               this.setCurrentAtkType(1);
                break;
            case 2:
                Mechanics.heroImgSetter(tower,this.animations[0]);
               rollValue =  this.sklRoll(tower);
                this.setCurrentAtkType(2);
                break;
            case 3:
                Mechanics.heroImgSetter(tower,this.animations[2]);
                rollValue = this.magkRoll(tower);
                this.setCurrentAtkType(0);
                break;
            case 4:
                Mechanics.heroImgSetter(tower,this.animations[1]);
                this.mgkCure(tower);
                JOptionPane.showMessageDialog(null,"Your Action: Str | Skl");
                    Integer turnSelect = gethActionSelected();
                BattleInterfaceMechanics.sethActionNull();
                if (turnSelect == 1 ){
                    Mechanics.heroImgSetter(tower,this.animations[0]);
                    rollValue = this.strRoll(tower);
                    this.setCurrentAtkType(1);
                }else {
                    Mechanics.heroImgSetter(tower,this.animations[0]);
                    rollValue = this.sklRoll(tower);
                    this.setCurrentAtkType(2);
                }
                break;
            default:
                Mechanics.heroImgSetter(tower,this.animations[0]);
                rollValue = this.strRoll(tower);
                this.setCurrentAtkType(1);
                break;
        }
        return rollValue;
    }

    public static void main(String[] args) {
    }

}