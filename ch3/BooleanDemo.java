package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει με βάση
 * δύο μεταβλητές: αν βρέχει ΚΑΙ αν
 * η θερμοκρασία < 0.
 */
public class BooleanDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        int temperature = 0;
        boolean isSnowing = false;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature (int)");
        temperature = in.nextInt();

        isSnowing = isRaining && (temperature < 0);

        System.out.println("Is snowing:" + isSnowing);
    }
}
