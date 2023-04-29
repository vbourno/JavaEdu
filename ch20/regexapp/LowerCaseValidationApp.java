package gr.aueb.cf.ch20.regexapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Gets  as input a string containing any 6 chars
// and asserts that the string includes at least
// one lowercase letter.
public class LowerCaseValidationApp {

    public static void main(String[] args) {
        String s = "a1234567";

        Pattern pattern = Pattern.compile("^(?=.*?[a-z]).{8,}$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
