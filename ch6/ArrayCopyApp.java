package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayCopyApp {

    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] clone;
        int[] arrClone;



        arrClone = shallowCopy(arr);

        //Copy
        clone = Arrays.copyOf(arr, arr.length);

        //Truncate one item at RHS
        clone = Arrays.copyOf(arr, arr.length - 1);

        //Padding with zeros at RHS (Right Hand Side)
        clone = Arrays.copyOf(arr, arr.length + 1);

    }
    public static int[] shallowCopy(int[] arr) {
        return arr;
    }
}
