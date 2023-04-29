package gr.aueb.cf.ch8;

/**
 * Array index out of bounds exception.
 * Runtime / unchecked exception
 */
public class ArrayIndexOutOfBoundsExceptionApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
