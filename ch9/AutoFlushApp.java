package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * PrintStream, FileOutStream
 *
 */
public class AutoFlushApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/users/vbour/documents/java/fos.txt", true),
                true,
                StandardCharsets.UTF_8);) {
            ps.println("Hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
