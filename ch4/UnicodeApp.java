package gr.aueb.cf.ch4;

/**
 * Prints unicode chars grater than
 * 4 Hex digits by using surrogate pairs.
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int codePoint = 0x1F600;  //smiley

        System.out.println("Smiley: \uD83D\uDE00");

        System.out.print("Smiley: ");
        System.out.println(Character.toChars(codePoint));


    }

}
