package gr.aueb.cf.ch2;

/**
 * Εμφανίζει στην κονσόλα (std-output) το
 * αποτέλεσμα της πρόσθεσης δύο ακεραίων.
 */

public class AddApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        // Εντολές

        result = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println();
        System.out.printf("Το αποτέλεσμα των %d + %d\n είναι %d", num1, num2, result);
    }

}
