package GameMechanics;

import GameGUI.BattleScreenO;

import javax.swing.*;
import java.awt.*;

public class MiscMechanics {

    public static void heroLifeDmg(BattleScreenO bs){
            bs.hLifeValue.setForeground(Color.red);


    }

    public static void heroDice(BattleScreenO bs, int value){
        SwingUtilities.invokeLater(()->{
            bs.heroRoll.setIcon(new ImageIcon(BattleScreenO.class.getResource("/tower/dice"+value+".png")));
        });
    }
    public static void heroOther(BattleScreenO bs, String path){
        SwingUtilities.invokeLater(()->{
            bs.heroRoll.setIcon(new ImageIcon(BattleScreenO.class.getResource(path)));
        });
    }
    public static void enemyLifeDmg(BattleScreenO bs){
            bs.eLifeValue.setForeground(Color.red);

    }
    public static void enemyDice(BattleScreenO bs, int value){
        SwingUtilities.invokeLater(()->{
            bs.enemyRoll.setIcon(new ImageIcon(BattleScreenO.class.getResource("/tower/dice"+value+".png")));
        });
    }
    public static void enemyOther(BattleScreenO bs, String path){
        SwingUtilities.invokeLater(()->{
            bs.enemyRoll.setIcon(new ImageIcon(BattleScreenO.class.getResource(path)));
        });
    }

    public static void diceReset(BattleScreenO bs){
        bs.enemyRoll.setIcon(null);
        bs.heroRoll.setIcon(null);
        bs.hLifeValue.setForeground(new Color(-16711681));
        bs.eLifeValue.setForeground(new Color(-16711681));
    }

}
