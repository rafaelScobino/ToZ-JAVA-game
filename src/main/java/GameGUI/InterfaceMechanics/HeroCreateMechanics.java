package GameGUI.InterfaceMechanics;

import static GameMechanics.DelayGambi.delay;

public class HeroCreateMechanics {

    private static String inputValue = null;

    public  static void setInputValue(String value){
        System.out.println(value);
        inputValue = value;
    }

    public static void setInputNull(){
        inputValue = null;
    }

    public static String getInputValue(){
        String value;
        do {
            delay(2000);
        }while (inputValue == null);
        value = inputValue;
        return value;
    }

}
