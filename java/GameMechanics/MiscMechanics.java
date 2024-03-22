package GameMechanics;

import GameGUI.BattleScreen;

import javax.swing.*;
import java.awt.*;

public class MiscMechanics {

    public static void heroLifeDmg(BattleScreen bs){
            bs.hLifeValue.setForeground(Color.red);


    }

    public static void heroDice(BattleScreen bs,int value){
        SwingUtilities.invokeLater(()->{
            bs.heroRoll.setIcon(new ImageIcon(BattleScreen.class.getResource("/tower/dice"+value+".png")));
        });
    }
    public static void enemyLifeDmg(BattleScreen bs){
            bs.eLifeValue.setForeground(Color.red);

    }
    public static void enemyDice(BattleScreen bs,int value){
        SwingUtilities.invokeLater(()->{
            bs.enemyRoll.setIcon(new ImageIcon(BattleScreen.class.getResource("/tower/dice"+value+".png")));
        });
    }

    public static void diceReset(BattleScreen bs){
        bs.enemyRoll.setIcon(null);
        bs.heroRoll.setIcon(null);
        bs.hLifeValue.setForeground(new Color(-16711681));
        bs.eLifeValue.setForeground(new Color(-16711681));
    }

}
