package gr.aueb.cf.ch6;

public class ArrayInitializer {

    public static void main(String[] args) {
        int[] grades;

        grades = new int[] {5, 8, 9, 4, 2};

        for (int grade : grades) {
            System.out.print(grade + " ");
        }
    }
}
