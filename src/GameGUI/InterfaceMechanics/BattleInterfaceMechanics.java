package GameGUI.InterfaceMechanics;

import GameGUI.BattleScreenO;

import java.awt.*;

import static GameMechanics.DelayGambi.delay;

public class BattleInterfaceMechanics {


    private static Integer hActionSelected;
    public static void sethActionSelected(Integer value){
        hActionSelected = value;
        System.out.println(value);
    }

    public static Integer gethActionSelected(){
        Integer value;
        do {
            delay(10);
        }while (hActionSelected == null);
        if (hActionSelected == null){
            hActionSelected = null;
        }
        value = hActionSelected;
        return value;
    }

    public static void sethActionNull(){
        hActionSelected = null;
    }

    public static void updateHeroStats(BattleScreenO tower, Double life, Integer str, Integer skl, Integer mgk){
        tower.sethLifeValue(life);
        tower.sethStrValue(str);
        tower.sethSklValue(skl);
        tower.sethMgkValue(mgk);
    }

    public static void updateEnemyStats(BattleScreenO tower , Double life, Integer str, Integer skl, Integer mgk){
        tower.seteLifeValue(life);
        tower.seteStrValue(str);
        tower.seteSklValue(skl);
        tower.seteMgkValue(mgk);
    }

    public static void updateHeroLife(BattleScreenO tower, Double life){
        tower.sethLifeValue(life);
    }
    public static void updateEnemyLife(BattleScreenO tower, Double life){
        tower.seteLifeValue(life);
    }

    public static void updateEsHeroLife(BattleScreenO tower, int valueH, int valueE, Double life){
        for (int i = 0; i <=  (valueE - valueH) ; i++) {
            tower.sethLifeValue(life-i);
            delay(200);
        }

    }
    public static void updateEsHeroLifeHeal(BattleScreenO tower, Double life){
        tower.hLifeValue.setForeground(Color.green);
        for (int i = 0; i <=  10 ; i++) {
            tower.sethLifeValue(life+i);
            delay(200);
        }
    }
    public static void updateHeroMgk(BattleScreenO tower, int mgk){
        tower.sethMgkValue(mgk-1);
            tower.hMgkValue.setForeground(Color.MAGENTA);

    }
    public static void updateEsEnemyLife(BattleScreenO tower, int valueH, int valueE, Double life){
        for (int i = 0; i <=  (valueH - valueE) ; i++) {
            tower.seteLifeValue(life-i);
            delay(200);
        }
    }
    public static void updateEsEnemyLifeHeal(BattleScreenO tower, Double life){
        tower.eLifeValue.setForeground(Color.green);
        for (int i = 0; i <=  10 ; i++) {
            tower.seteLifeValue(life+i);
            delay(200);
        }
    }
    public static void updateEnemyMgk(BattleScreenO tower, int mgk){
        tower.seteMgkValue(mgk-1);
            tower.eMgkValue.setForeground(Color.MAGENTA);
    }


    public static void updateTurnCounter(BattleScreenO tower, Integer value){
        tower.setTurnNumber(value);
    }

    public static void setNames(BattleScreenO tower, String hName, String eName){
        tower.setHeroName(hName);
        tower.setEnemyName(eName);
    }


}
