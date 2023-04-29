package gr.aueb.cf.ch17.runna;

public class Main {

    private final static Runnable joa = new Knight("joa");
    private final static Runnable whiteKnight = new Knight("White Knight");
    private final static Runnable blackKnight = new Knight("Black Knight");

    public static void main(String[] args) {

        (new Thread(joa)).start();
        (new Thread(whiteKnight)).start();
        (new Thread(blackKnight)).start();
    }
}
