package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 3, 10};
        int min = 0;
        int minPosition = 0;
        int tmp;

        for (int i = 0; i < arr.length; i++) {

            min = arr[i];
            minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }
            tmp = arr[i];
            arr[i] = min;
            arr[minPosition] = tmp;
        }
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

}