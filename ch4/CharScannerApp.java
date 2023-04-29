package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει char με Scanner
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';

        System.out.println("Please insert a char");
        inputChar = in.nextLine().charAt(0);

        System.out.println("input char: " + inputChar);

    }
}
