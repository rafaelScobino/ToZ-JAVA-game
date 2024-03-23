package GameMechanics;

import java.util.Timer;

public class DelayGambi {

    // Method that waits for the specified duration in milliseconds
    public static void delay(Integer value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("wainting "+value);

    }

}
