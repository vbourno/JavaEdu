package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει ακεραίους μέχρι να βρει
 * αρνητικό, οπότε σταματάει. Μετράει
 * το πλήθος των θετικών.
 */
public class PositivesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Please insert a positive int (or negative for exit)");
        num = in.nextInt();

        while (num >= 0) {
            System.out.println("Positive inserted");
            positivesCount++;
            System.out.println("Please insert a positive int (or negative for exit)");
            num = in.nextInt();
        }
        System.out.println("A negative was inserted.");
        System.out.println("Positives total count: " + positivesCount);
    }
}
