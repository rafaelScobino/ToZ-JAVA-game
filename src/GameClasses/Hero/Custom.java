package GameClasses.Hero;

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

    public  void setStats() {
         cLife = Double.parseDouble(JOptionPane.showInputDialog("Sua vida"));
         cStrength = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Stren"));
         cSkill = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Skil"));
         cMagicka = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Mgk"));
    }

    public static void main(String[] args) {

    }

}
