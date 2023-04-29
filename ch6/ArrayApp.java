package gr.aueb.cf.ch6;

public class ArrayApp {

    public static void main(String[] args) {
        //Declaration and initialisation
        int[] arr = new int[4];

        //Populate
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 13;
        arr[3] = 56;

        //Traverse
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
