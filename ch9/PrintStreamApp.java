package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Prints with Print Stream.
 */
public class PrintStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/users/vbour/documents/java/f1.txt");) {
            ps.println("Hello Coding Factory");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
