package gr.aueb.cf.ch6;

public class ArraySearchApp {

    public static void main(String[] args) {
        final int KEY = 30;
        boolean keyisfound = false;
        int[] arr = {4, 7, 90, 40, 30, 70, 50};
        int position = 0;

        /*for (int item : arr) {
            if (item == KEY) {
                keyisfound = true;
                break;
            }*/


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == KEY) {
                keyisfound = true;
                position = i;
                break;
            }
        }

        System.out.printf("Key: %d, Position: %d", KEY, (position + 1));

        /*if (keyisfound) {
            System.out.println("Key was found");
        } else {
            System.out.println("Key was not found");
        }*/
    }
}
