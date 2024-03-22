package GameGUI.InterfaceMechanics;

import GameGUI.HeroCreationScreen;

import javax.swing.*;

public class HeroCreateMechanics {

    private static String inputValue = null;

    public  static void setInputValue(String value){
        System.out.println(value);
        inputValue = value;
    }
    public static String getInputValue(){
        String value;
        value = inputValue;
        return value;
    }

    private static String classSelected = null;
    private static String selectionMethodString = null;

    public static void selectionMethod(){
        selectionMethodString = classSelected;

    }

    public static String getSelectionMethodString(){
        return selectionMethodString;
    }

    public static void setClassSelected(String classSelected) {
        HeroCreateMechanics.classSelected = classSelected;
    }

    public static void setClassDisplay(HeroCreationScreen hcs){
        switch (classSelected) {
            case "warrior":
                hcs.heroImg.setIcon(new ImageIcon(HeroCreationScreen.class.getResource("/hero/warrior/warriorIdle.gif")));
                hcs.lifeTextPane.setText("80");
                hcs.strValueTextPane.setText("7");
                hcs.skillValuTextPane.setText("3");
                hcs.magkValueTextPane.setText("0");
                break;
            case "wizard":
                hcs.heroImg.setIcon(new ImageIcon(HeroCreationScreen.class.getResource("/hero/wizard/wizardIdle.gif")));
                hcs.lifeTextPane.setText("50");
                hcs.strValueTextPane.setText("3");
                hcs.skillValuTextPane.setText("7");
                hcs.magkValueTextPane.setText("3");
                break;
            case "ranger":
                hcs.heroImg.setIcon(new ImageIcon(HeroCreationScreen.class.getResource("/hero/ranger/rangerIdle.gif")));
                hcs.lifeTextPane.setText("60");
                hcs.strValueTextPane.setText("6");
                hcs.skillValuTextPane.setText("4");
                hcs.magkValueTextPane.setText("2");
                break;
            case "fighter":
                hcs.heroImg.setIcon(new ImageIcon(HeroCreationScreen.class.getResource("/hero/fighter/fighterIdle.gif")));
                hcs.lifeTextPane.setText("70");
                hcs.strValueTextPane.setText("4");
                hcs.skillValuTextPane.setText("6");
                hcs.magkValueTextPane.setText("1");
                break;
        }
    }



}
