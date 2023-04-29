package gr.aueb.cf.ch4;

/**
 * 1 star 1st line
 * 2 stars 2nd line
 * 3 stars 3d line
 * ...
 * 10 stars 10th line
 */
public class StarsAsc10App {

    public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
