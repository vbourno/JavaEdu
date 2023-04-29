package gr.aueb.cf.ch11_12.immutableproject;
/**
 * Immutable Point 3D.
 */

import gr.aueb.cf.ch11_12.pointproject.model.Point;

public class Point3D {
    private final Point point;
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY());
        this.z = z;
    }

    public Point getPoint() {
        return new Point(this.point.getX(), this.point.getY());
    }

    public int getZ() {
        return z;
    }
}
