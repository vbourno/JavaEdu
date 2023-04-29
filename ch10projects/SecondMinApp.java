package gr.aueb.cf.ch10projects;

public class SecondMinApp {

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 7, 12, 6};
        int secMin;

        secMin = getSecondMinPosition(arr);
        if (secMin == -1) System.exit(1);
        System.out.println();
    }

    public static int getSecondMinPosition(int[] arr) {
        int min = 0;
        int secondMin = 1;
        int minValue = 0;
        int secondMinValue = 0;

        if (arr == null) return -1;
        if (arr.length < 2) return  -1;

        minValue = Integer.MAX_VALUE;
        secondMinValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < minValue) && (arr[i] < secondMinValue)) {
                secondMin = min;
                secondMinValue = minValue;
                min = i;
                minValue = arr[i];
            }else if ((arr[i] > minValue) && (arr[i] < secondMinValue)) {
                secondMin = i;
                secondMinValue = arr[i];
            }
        }
        return secondMin;
    }
}
