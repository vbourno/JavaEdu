package gr.aueb.cf.ch6;

import java.util.Scanner;

public class ArrayPopulateFromStdInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ages = new int[5];

        for (int age : ages) {
            System.out.print(age + " ");
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Please insert an int for position " + (i + 1));
            ages[i] = in.nextInt();
        }
        for (int age : ages) {
            System.out.print(age + " ");
        }
        //in.close();
    }
}
