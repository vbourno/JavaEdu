package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει πόσα
 * αστεράκια θα εκτυπωθούν.
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int i = 1;

        System.out.println("Please insert number of stars");
        n = in.nextInt();

        while (i <= n) {
            System.out.println("*");
            i++;
        }

        System.out.println();
    }
}
