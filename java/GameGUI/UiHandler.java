package GameGUI;

import javax.swing.*;

public class UiHandler {

    public static JPanel battleFrame(BattleScreen bs){
        return bs.towerFrame;
    }

    public static JPanel titleFrame(TitleScreen ts){
        return ts.TitleScreen;
    }

    public static JPanel heroCreation(HeroCreationScreen hcs){return hcs.heroCreateScreen;}

}
