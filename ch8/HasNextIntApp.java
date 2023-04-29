package gr.aueb.cf.ch8;

import java.util.Scanner;

public class HasNextIntApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        final int MAGIC = 12;
        boolean errorFlag = false;

        while (true) {
            if (!errorFlag) {
                System.out.println("Please guess the magic int");
            }
            if (in.hasNextInt()) {
                inputNum = in.nextInt();
                errorFlag = false;
            } else {
                System.out.println("Please insert a valid int number");
                errorFlag = true;
                in.nextLine();
                continue;
            }
            System.out.println("Input number: " + inputNum + " is not the magic int");
            if (inputNum == MAGIC) {
                System.out.println("You guessed the magic int!");
                break;
            }
        }
        System.out.println("Thank you for using the app!");
    }
}
