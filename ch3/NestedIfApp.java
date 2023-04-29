package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δέχεται ως είσοδο: 1) Σύνολο βαθμολογίας
 * και 2) Πλήθος μαθημάτων
 * και υπολογίζει τον μέσο όρο. Στη συνέχεια
 * δίνει feedback στον χρήστη: 9-10 Άριστα, 7-8 Λίαν Καλώς,
 * 5-6 Καλώς, κάτω από 5 Αποτυχία
 */
public class NestedIfApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int modulesCount = 0;
        int totalMarks = 0;
        int average = 0;

        System.out.println("Please insert the sum of grades");
        totalMarks = in.nextInt();

        System.out.println("Please insert modules' count");
        modulesCount = in.nextInt();

        if (modulesCount != 0) {
            average = totalMarks / modulesCount;

            if ((average >= 9) && (average <= 10)) {
                System.out.println("Excellent! " + average);
            } else if ((average >= 7) && (average <= 8)) {
                System.out.println("Very Good " + average);
            } else if ((average >= 5) && (average <= 6)) {
                System.out.println("Good " + average);
            } else if ((average >= 0) && (average <= 4)) {
                System.out.println("Fail " + average);
            } else {
                System.out.println("Error in input data");
            }
        } else {
            System.out.println("Modules' count cannot be zero");
        }

    }
}