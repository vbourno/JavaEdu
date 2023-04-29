package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Evaluates a^n using method.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;

        System.out.println("Please insert a & n");
        a = in.nextInt();
        n = in.nextInt();
        int result = 0;

        /**
         * Invokes pow with actual parameters a, n
         * pow returns the power of a^n
         */

        result = pow(a, n);  //Αλλιώς PowerApp.pow(a, n);

        System.out.printf("%d^%d = %d", a, n, result);
    }

    /**
     * Returns the power af a^n.
     * @param a     the base
     * @param n     the power
     * @return      the power of a to n
     */
    public static int pow(int a, int n) {
        //Δήλωση και αρχικοποίηση
        int power = 1;

        //Εντολές - Δομές ελέγχου
        for (int i = 1; i <= n; i++) {
            power *= a;
        }

        //Return power
        return power;
    }
}
