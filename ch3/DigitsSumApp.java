package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Άθροισμα των ψηφίων ενός ακεραίου.
 * Αν έχουμε το 123, τότε το άθροισμα
 * είναι 6.
 */
public class DigitsSumApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int sum = 0;
        int digit = 0;
        int digitsCount = 0;

        System.out.println("Please insert a num (int)");
        num = in.nextInt();
        do {
            digit = num % 10;
            digitsCount++;
            sum += digit; //sum = sum + digit;
            num = num / 10;
        } while (num != 0);

        System.out.printf("DigitsCount: %d, DigitsSum: %d", digitsCount, sum);
    }
}
