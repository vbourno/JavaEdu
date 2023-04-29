package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int KEY = 10;
        int inputNum = 0;
        boolean bingo = false;

        do {

            System.out.println("Please guess the key number");
            inputNum = in.nextInt();

            if (inputNum == KEY) {
                System.out.println("Bingo");
                bingo = true;
            } else {
                System.out.println("Try again");
            }
        } while (!bingo);

    }
}
