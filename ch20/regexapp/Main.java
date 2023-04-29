package gr.aueb.cf.ch20.regexapp;

public class Main {

    public static void main(String[] args) {
        String s = "green";
        System.out.println(isRredOrGgreen(s));

        String st = "Sing";
        System.out.println(hasOneUppercadseEndsWithIng(st));

        String myMail = "vbourno@yahoo.gr";
        System.out.println(isValidEmail(myMail));
    }

    // If is "Red"
    public static boolean isRed(String s) {
        return s.matches("Red");
    }

    // If is "Red" or "Green"
    public static boolean isRedOrGreen(String s){
        return s.matches("Red|Green");
    }

    // If is "Red" or "red" or "Green" or "green"
    public static boolean isRredOrGgreen(String s){
        return s.matches("[Rr]ed|[Gg]reen");
    }

    // Begin with one uppercase letter and then ending with "ing"
    public static boolean hasOneUppercadseEndsWithIng(String s) {
        return s.matches("[A-Z]ing");
    }

    // Begin with one uppercase/lowercase letter and then ending with "ing"
    public static boolean hasOneUpperLowercadseEndsWithIng(String s) {
        return s.matches("[a-zA-Z]ing");
    }

    // One space, then one digit
    public static boolean isAnySpaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    // One letter, then one digit
    public static boolean isLetterDigit(String s) {
        return s.matches("^\\w\\d$");
    }

    public static boolean isLetterDigitAnywhere(String s) {
        return s.matches(".*\\w\\d.*");
    }

    // Letter-Digit as a whole word
    public static boolean isLetterDigitAsWord(String s) {
        return s.matches(".*\\b\\w\\d\\b.*");
    }

    // e-mail
    public static boolean isValidEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.(com|gr)");
    }

    // Two upeercase lettersDashSevenDigits
    public static boolean isTwoLettersDashSevenDigits(String s) {
        return s.matches("[A-Z]{2}-\\d{7}");
    }

    // Retirns an array of tokens delimited by one or more spaces
    public static String[] getTokens(String s) {
        return s.split("\\s+");
    }

    // Replaces one or more spaces with one space
    public static String normilizeStr(String s) {
        return s.replaceAll("s+", " ");
    }

    public static String mutuallyChange(String s) {
        return s.replaceAll("(.*)\\s(.*)", "$2 $1");
    }
}
