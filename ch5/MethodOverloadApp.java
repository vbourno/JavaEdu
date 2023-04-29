package gr.aueb.cf.ch5;

/**
 *Demonstrates the usage of method overloading (υπερφόρτωση).
 * Δηλαδή μέθοδοι με το ίδιο όνομα αλλά διαφορετική
 * λίστα τυπικών παραμέτρων.
 */
public class MethodOverloadApp {

    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        long sum3 = 0;
        long sum4 = 0;

        sum1 = add(1, 2);
        sum3 = add(1L, 2L);
        sum2 = add(1, 2, 12);
        sum4 = add(1, 2, 12L);

        System.out.printf("sum1: %d, sum3: %d, sum2: %d, sum4: %d", sum1, sum3, sum2, sum4);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static long add(int a, int b, long c) {
        return a + b + c;
    }
}
