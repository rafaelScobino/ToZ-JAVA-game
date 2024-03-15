package GameClasses.Hero;

import GameGUI.InterfaceMechanics.HeroCreateMechanics;

import javax.swing.JOptionPane;

public class Custom extends Hero {

     Double cLife;
     Integer cStrength;
     Integer cSkill;
     Integer cMagicka;

    public Custom() {
        super( "",0.0, 0, 0, 0,0);
        setStats();
        life = cLife;
        strength = cStrength;
        skill = cSkill;
        magicka = cMagicka;
    }

    public void setStats() {
        JOptionPane.showMessageDialog(null,"Sua Vida:");
         cLife = Double.valueOf(HeroCreateMechanics.getInputValue());
         HeroCreateMechanics.setInputNull();
        JOptionPane.showMessageDialog(null,"Sua Str/Força:");
         cStrength = Integer.valueOf(HeroCreateMechanics.getInputValue());
        HeroCreateMechanics.setInputNull();
        JOptionPane.showMessageDialog(null,"Sua Skill:");
         cSkill = Integer.valueOf(HeroCreateMechanics.getInputValue());
        HeroCreateMechanics.setInputNull();
        JOptionPane.showMessageDialog(null,"Sua Magicka:");
         cMagicka = Integer.valueOf(HeroCreateMechanics.getInputValue());
        HeroCreateMechanics.setInputNull();
    }

    public static void main(String[] args) {

    }

}
