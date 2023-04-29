package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει από το stdin την
 * αρχική τιμή, την τελική τιμη, το
 * βήμα αύξησης/μείωσης. Εκτυπώνει το
 * i και το πλήθος των επαναλήψεων.
 */
public class ForFlexApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iterations = 0;

        System.out.println("Please insert start, end and step (ints)");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i = i + step) {
            System.out.print(i + " ");
            iterations++;   //iterations = iterations +1;
          }
        System.out.println();
        System.out.println("Iterations = " + iterations);
    }
}
