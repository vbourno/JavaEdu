package gr.aueb.cf.ch6;

public class MinMaxApp {

    public static void main(String[] args) {
        int[] arr = {4, 8, 3, 9};
        int minPosition = 0;
        int maxPosition = 0;
        int minValue = arr[minPosition];
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        System.out.println("Min value: " + minValue + " Min position: " + (minPosition + 1));
        System.out.println("Max value: " + maxValue + " Max position: " + (maxPosition +1));
    }
}
