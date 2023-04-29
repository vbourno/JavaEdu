package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το 1 * 2 * 3 * ... * n,
 * όπου n είναι ένας ακέραιος που δίνει
 * ο χρήστης
 */
public class MulNApp {

    public static void main(String[] args) {
        int mul = 1;
        int i = 1;
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert a number (int)");
        n = in.nextInt();

        while (i <= n) {
            mul = mul * i;
            i++;
        }
        System.out.println("mul = " + mul);
    }
}