package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FlushApp {

    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("C:/users/vbour/documents/java/flush-text.txt");
            pw.print("Hello");
            //pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
