package gr.aueb.cf.ch7;

public class TraverseApp {

    public static void main(String[] args) {
        String firstname = "vagos";
        String cf = "Coding Factory";

        for (int i = 0; i < firstname.length(); i++) {
            System.out.print(firstname.charAt(i) + " ");
        }
        System.out.println();

        for (char ch : cf.toCharArray()) {
            System.out.print(ch + " ");
           }
        System.out.println();

        System.out.println("\u2764");

        //Reverse traverse
        for (int i = cf.length() - 1; i >= 0; i--) {
            System.out.print(cf.charAt(i) + " ");
        }
    }
}
