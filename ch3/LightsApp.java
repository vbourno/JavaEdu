package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν θα ανάψουν τα φώτα
 * του αυτοκινήτου με βάση 3 μεταβλητές: αν
 * βρέχει και ταυτόχρονα ισχύει ένα τουλάχιστον
 * από τα επόμενα, είναι σκοτάδι Η τρέχουμε (speed > 100).
 * Αυτές τις τιμές τις λαμβάνουμε από τον χρήστη.
 */
public class LightsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        final int MIN_VELOCITY = 100;
        int velocity = 0;
        boolean lightsOn = false;

        System.out.println("Please insert if it is raining (true/false), " +
                "if it is dark (true/false) and velocity (int)");

        isRaining = in.nextBoolean();
        isDark = in.nextBoolean();
        velocity = in.nextInt();

        isRunning = velocity > MIN_VELOCITY;
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on: " + lightsOn);

    }
}
