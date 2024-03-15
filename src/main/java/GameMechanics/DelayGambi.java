package GameMechanics;

public class DelayGambi {

    // Method that waits for the specified duration in milliseconds
    public static void delay(Integer value) {
        try {
            Thread.sleep(value);
            System.out.println("Method executed after waiting");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
