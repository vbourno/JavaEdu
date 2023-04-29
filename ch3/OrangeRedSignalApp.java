package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ένα αεροσκάφος έχει δύο δεξαμενές. Ο
 * πιλότος δίνει true σε μία κονσόλα αν η μία
 * δεξαμενή έχει < 1/4 καύσιμα και τότε ανάβει
 * ένα πορτοκαλί σήμα, ενώ αν δώσει 2 true, τότε
 * ανάβει ένα κόκκινα σήμα.
 */
public class OrangeRedSignalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean orangeOn = false;
        boolean redOn = false;
        boolean isTank1LTOneQuarter = false;
        boolean isTank2LTOneQuarter = false;

        System.out.println("Please insert if Tank1/Tank2 are Less Than 1/4 (true/false)");
        isTank1LTOneQuarter = in.nextBoolean();
        isTank2LTOneQuarter = in.nextBoolean();

        orangeOn = isTank1LTOneQuarter || isTank2LTOneQuarter;
        redOn = isTank1LTOneQuarter && isTank2LTOneQuarter;

        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red on: " +redOn);
    }
}
