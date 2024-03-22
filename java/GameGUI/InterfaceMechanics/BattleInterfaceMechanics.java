package GameGUI.InterfaceMechanics;

import GameGUI.BattleScreen;

import java.util.Timer;

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

    public static void updateHeroStats(BattleScreen tower, Double life, Integer str, Integer skl, Integer mgk){
        tower.sethLifeValue(life);
        tower.sethStrValue(str);
        tower.sethSklValue(skl);
        tower.sethMgkValue(mgk);
    }

    public static void updateEnemyStats(BattleScreen tower , Double life, Integer str, Integer skl, Integer mgk){
        tower.seteLifeValue(life);
        tower.seteStrValue(str);
        tower.seteSklValue(skl);
        tower.seteMgkValue(mgk);
    }

    public static void updateHeroLife(BattleScreen tower, Double life){
        tower.sethLifeValue(life);
    }
    public static void updateEnemyLife(BattleScreen tower, Double life){
        tower.seteLifeValue(life);
    }

    public static void updateEsHeroLife(BattleScreen tower,int valueH, int valueE, Double life){
        for (int i = 0; i <=  (valueE - valueH) ; i++) {
            tower.sethLifeValue(life-i);
            delay(500);
        }

    }
    public static void updateEsEnemyLife(BattleScreen tower,int valueH, int valueE, Double life){
        for (int i = 0; i <=  (valueH - valueE) ; i++) {
            tower.seteLifeValue(life-i);
            delay(500);
        }

    }

    public static void updateTurnCounter(BattleScreen tower, Integer value){
        tower.setTurnNumber(value);
    }

    public static void setNames(BattleScreen tower, String hName, String eName){
        tower.setHeroName(hName);
        tower.setEnemyName(eName);
    }


}
