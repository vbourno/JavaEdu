package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Guesses a key num and gets a bingo.
 * Impl with while-d0-break
 */
public class Bingo2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int KEY = 10;
        int num = 0;
        boolean keyisFound = false;

        while (true) {
            System.out.println("Please guess the key");
            num = in.nextInt();

            if (num == KEY){
                keyisFound = true;
                break;
            }else {
                System.out.println("Please try again");
            }
        }

        if (keyisFound) System.out.println("Congratulations!");
    }
}
