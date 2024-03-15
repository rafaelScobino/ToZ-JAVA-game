package GameGUI.InterfaceMechanics;

import GameGUI.TowerBattleGUI;

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
            delay(1000);
        }while (hActionSelected == null);
        value = hActionSelected;
        return value;
    }

    public static void sethActionNull(){
        hActionSelected = null;
    }

    public static void updateHeroStats(TowerBattleGUI tower,Double life,Integer str,Integer skl,Integer mgk){
        tower.sethLifeValue(life);
        tower.sethStrValue(str);
        tower.sethSklValue(skl);
        tower.sethMgkValue(mgk);
    }

    public static void updateEnemyStats(TowerBattleGUI tower ,Double life,Integer str,Integer skl,Integer mgk){
        tower.seteLifeValue(life);
        tower.seteStrValue(str);
        tower.seteSklValue(skl);
        tower.seteMgkValue(mgk);
    }

    public static void updateHeroLife(Double life){
        TowerBattleGUI.frame.sethLifeValue(life);
    }
    public static void updateEnemyLife(Double life){
        TowerBattleGUI.frame.seteLifeValue(life);
    }

    public static void updateTurnCounter(TowerBattleGUI tower,Integer value){
        tower.setTurnNumber(value);
    }

    public static void setNames(TowerBattleGUI tower, String hName, String eName){
        tower.setHeroName(hName);
        tower.setEnemyName(eName);
    }


}
