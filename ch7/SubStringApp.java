package gr.aueb.cf.ch7;

public class SubStringApp {

    public static void main(String[] args) {
        String s = "Athens Uni of Eco and Bus";
        String subStr = "";

        subStr = s.substring(0, 6);

        System.out.println(subStr);
    }
}
