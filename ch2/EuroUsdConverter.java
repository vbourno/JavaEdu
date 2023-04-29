package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Euro to USD Converter.
 */
public class EuroUsdConverter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int PARITY = 99;  // exchange rate Euro to USD
        int totalUsacents = 0;
        int inputEuros = 0;
        int usaDollars = 0;
        int usaCents = 0;


        System.out.println("Please insert an amount (Euros)");
        inputEuros = in.nextInt();

        totalUsacents = inputEuros * PARITY;
        usaDollars = totalUsacents / 100;
        usaCents = totalUsacents % 100;

        System.out.printf("%d euros = %d USA dollars & %d USA cents", inputEuros, usaDollars, usaCents);

    }
}
