package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Reads two ints from standard input
 * (keyboard) and prints the sum
 *
 * @author vbour
 */
public class ReadScannerApp {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //Εντολές
        System.out.println("Please insert a number (int)");
        num1 = sc.nextInt();
        System.out.println("Please insert another number (int)");
        num2 = sc.nextInt();

        sum = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Sum of %d + %d = %d", num1, num2, sum);
    }
}
