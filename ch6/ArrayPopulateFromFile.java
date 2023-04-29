package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayPopulateFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        int[] ages = new int[5];
        File intFd = new File("C:/Users/vbour/Documents/java.txt");
        Scanner in = new Scanner(intFd);

        for (int i = 0; i < ages.length; i++) {
            ages[i] = in.nextInt();
        }
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
