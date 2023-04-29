package gr.aueb.cf.ch4;

/**
 * Compares two chars
 */
public class CompareApp {

    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'A';
        boolean isGrater = false;

        System.out.println(ch1);
        System.out.println(ch2);

        if (ch1 > ch2){
            isGrater = true;
        }
        System.out.println("ch1 Is grater: " + isGrater);
    }
}
