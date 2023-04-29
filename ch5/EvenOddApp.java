package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;

        System.out.println("Please insert an int");
        a = in.nextInt();

        System.out.printf("Ο %d%s είναι άρτιος", a, (isEven(a) ? "" : " δεν"));
        System.out.println();
        System.out.printf("Ο %d%s είναι περιττός", a, (isOdd(a) ? "" : " δεν"));
    }

    /**
     *Evaluates a as even.
     *
     * @param a
     *      the int to evaluate
     * @return
     *      true if the number is even, false otherwise
     */
    public static boolean isEven(int a) {
        return (a % 2 == 0);

       /* if (a % 2 == 0) {
            return true
        } else {
            return false;
        } */
    }

    /**
     * Evaluates a as odd.
     *
     * @param a     the int to evaluate
     * @return      true if the number is odd, false otherwise
     */
        public static boolean isOdd(int a) {
        return !isEven(a);
    }


}
