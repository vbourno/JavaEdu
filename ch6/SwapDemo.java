package gr.aueb.cf.ch6;

public class SwapDemo {
    public static void main(String[] args) {
        int[] arr = {2, 10};
        printArray(arr);
        System.out.println();

        swap(arr);
        printArray(arr);

    }

    public static void swap(int[] arr) {
        if (arr.length != 2) return;

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void printArray(int[] arr) {

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

}
