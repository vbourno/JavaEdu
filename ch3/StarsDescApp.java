package gr.aueb.cf.ch3;

/**
 * Εκτυπώνει 10 σειρές με 10 αστεράκια στην 1η σειρά,
 * 9 αστεράκια στην 2η σειρά, κοκ μέχρι 1 αστεράκι
 * στη 10η σειρά.
 */
public class StarsDescApp {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 10) {
            j = 10;
            while (j >= i) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}