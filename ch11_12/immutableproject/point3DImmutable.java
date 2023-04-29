package gr.aueb.cf.ch11_12.immutableproject;

public class point3DImmutable {
    private final ImmutablePoint point;
    private final int z;

    public point3DImmutable() {
        point = new ImmutablePoint();
        z = 0;
    }

    public point3DImmutable(ImmutablePoint point, int z) {
        this.point = point;
        this.z = z;
    }


}
