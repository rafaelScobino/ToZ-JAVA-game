package GameGUI.InterfaceMechanics;

import GameGUI.TowerBattleGUI;

public class BattleInterfaceMechanics {

    private static Integer hActionSelected;
    public static void sethActionSelected(Integer value){
        hActionSelected = value;
        System.out.println(value);
    }

    public static Integer gethActionSelected(){
        System.out.println(hActionSelected);
        return hActionSelected;
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


}
