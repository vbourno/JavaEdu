package gr.aueb.cf.ch8;


import java.util.Scanner;

/**
 * Arithmetic exception (divide by zero exception)
 * Unchecked exception / Runtime exception
 */
public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            try {
                System.out.println("Please insert a numerator and a denominator");
                numerator = in.nextInt();
                denominator = in.nextInt();

                result = numerator / denominator;
                if (result == 1) break;
                System.out.printf("%d / %d = %d\n", numerator, denominator, result);
            } catch (ArithmeticException e) {
                //e.printStackTrace();
                System.out.println("Please insert a non-zero denominator");;
            }
        }

    }
}
