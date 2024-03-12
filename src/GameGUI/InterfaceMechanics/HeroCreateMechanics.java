package GameGUI.InterfaceMechanics;

public class HeroCreateMechanics {

    private static String inputValue;

    public  static void setInputValue(String value){
        inputValue = value;
        System.out.println(value);
    }

    public static String getInputValue(){
        System.out.println(inputValue);
        return inputValue;
    }
}
