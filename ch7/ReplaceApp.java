package gr.aueb.cf.ch7;

public class ReplaceApp {

    public static void main(String[] args) {
        String firstname = "Maria-Helen";
        String nickname = "";
        String simplename = "";

        nickname = firstname.replace("-Helen", "");
        simplename = firstname.replace("-", " ");

        System.out.println(firstname);
        System.out.println(nickname);
        System.out.println(simplename);
    }
}
