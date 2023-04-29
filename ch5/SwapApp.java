package gr.aueb.cf.ch5;

/**
 * Mutually exchanges the values of a, b
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 2;
        int b = 10;

        swap(a, b);

        System.out.println("a = " + a + ", b = " + b);
    }

    /**
     * Exchanges mutually a, b
     *
     * @param a     the first value
     * @param b     the second value
     */
    public static void swap (int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
