package gr.aueb.cf.ch2;

import java.util.Locale;

/**
 * Προσθέτει δύο ακεραίους και εμφανίζει
 * το αποτέλεσμα στην κονσόλα
 */
public class SumApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών

        int num1 = 19004567;
        int num2 = 5465461;
        int sum = 0;

        //Εντολές
        sum = num1 + num2;

        //Εμφάνιση αποτελεσμάτων
        System.out.println("Το άθροισμα των" + num1 + "," + num2 + "είναι" + sum);
        System.out.printf("Το άθροισμα των %,d, %,d είναι %,d,", num1, num2, sum);
        System.out.printf(Locale.ENGLISH, "Το άθροισμα των %,d, %,d είναι %,d,", num1, num2, sum);

    }
}
