package gr.aueb.cf.ch14.flyweight;

public final class ImmutablePoint {

    private final int x;
    private final int y;

    ImmutablePoint() {
        x = 0;
        y = 0;
    }

    ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String convertToString() {
        return "(" + x + ", " + y + ")";
    }
}
