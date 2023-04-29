package gr.aueb.cf.ch3;

/**
 * Εμφανίζει 10 οριζόντια αστεράκια,
 * επαναληπτικά ένα-ένα.
 */
public class Stars10App {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.print("*");
            i++;
        }
    }
}
