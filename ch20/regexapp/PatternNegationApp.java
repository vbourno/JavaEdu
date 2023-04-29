package gr.aueb.cf.ch20.regexapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternNegationApp {

    public static void main(String[] args) {

        String s = "B!@@:K555:D12!:";

        Pattern pattern = Pattern.compile("[A-Z&&[^ADX]].*?:");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
