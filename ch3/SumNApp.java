package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει από το standard input ένα ακέραιο n
 * και βρίσκει το άθροισμα από 1 - n, δηλαδή
 * 1 + 2 + ... + n
 */
public class SumNApp {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert a number (int)");
        n = in.nextInt();

        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
