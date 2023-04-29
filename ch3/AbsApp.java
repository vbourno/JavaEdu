package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το απόλυτο ενός αριθμού (int), όπου
 * το απόλυτο ενός θετικού είναι ο ίδιος ο αριθμός,
 * ενώ το απόλυτο ενός αρνητικού είναι ο
 * αντίστοιχος θετικός
 */
public class AbsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please insert a num");
        num = in.nextInt();

        abs = (num > 0) ? num : -num;

        System.out.printf("Abs(%d) = %d", num, abs);

    }
}
