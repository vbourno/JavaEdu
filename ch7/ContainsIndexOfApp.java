package gr.aueb.cf.ch7;

import java.util.Scanner;

public class ContainsIndexOfApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";

        System.out.println("Please insert string");
        s = in.nextLine();
        int index = 0;

        if (s.contains("Athens")) {
            index = s.indexOf("Athens");
            System.out.println("Bingo! Index: " + (index + 1));
        } else {
            index = s.indexOf("Athens");
            System.out.println("Athens not found. Index: " + (index + 1));
        }
        System.out.println("Total string length: " + s.length());

    }
}
