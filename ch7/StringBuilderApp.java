package gr.aueb.cf.ch7;

public class StringBuilderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String concatResult = "";
        long timeStart = 0L;
        long timeEnd = 0L;

        double stringElapsedTime = 0.0;
        double SbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 50000; i++) {
            concatResult = concatResult + i;
        }
        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (double) (timeEnd - timeStart) / 1000;     // (timeEnd - timeStart) / 1000.0

        timeStart = System.nanoTime();
        for (int i = 1; i <= 50000; i++) {
            sb.append(i);
        }
        timeEnd = System.nanoTime();
        stringElapsedTime = (timeEnd - timeStart) / 1_000_000_000.0;

        System.out.println("String concat time: " + stringElapsedTime);
        System.out.println("String Builder concat time: " + SbElapsedTime);
    }
}
