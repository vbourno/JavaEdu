package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ShiftArrayApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] shifted = new int[arr.length];

        //shifted = shiftArrayByOne(arr);
        shifted = shift(arr, 3);
        printArray(arr);
        printArray(shifted);
    }

    public static int[] shiftArrayByOne(int[] arr) {
        if (arr == null) return null;
        int[] shifted = new int[arr.length];
        shifted = Arrays.copyOf(arr, arr.length);



        for (int i = 0; i < arr.length - 1; i++) {
            shifted[i] = arr[i + 1];
            }
        shifted[shifted.length -1] = 0;

        return shifted;
    }

    public static int[] shift(int[] vector, int shift) {
        if (vector == null) return null;
        int[] shifted = new int[vector.length];

        if (shift > vector.length) {
            return shifted;
        }
        shifted = Arrays.copyOfRange(vector, shift, vector.length + shift);
        return shifted;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
