package gr.aueb.cf.ch3;

/**
 * Εκτυπώνει 10 σειρές με 10
 * αστεράκια η κάθε σειρά.
 */
public class Stars10x10 {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i<=10) {
            j = 1;
            while (j<=10) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
