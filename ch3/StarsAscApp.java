package gr.aueb.cf.ch3;

/**
 * Εκτυπώνει 10 σειρές με 1 αστεράκι στην 1η σειρά,
 * 2 αστεράκια στην 2η σειρά, κοκ μέχρι 10 αστεράκια
 * στη 10η σειρά.
 */
public class StarsAscApp {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 10) {
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
