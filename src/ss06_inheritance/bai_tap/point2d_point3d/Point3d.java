package ss06_inheritance.bai_tap.point2d_point3d;

import java.util.Arrays;

public class Point3d extends Point2d {
    private float z;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getX() {
        return super.getX();
    }

    public void setX(float newX) {
        super.setX(newX);
    }

    public float getY() {
        return super.getY();
    }

    public void setY(float newY) {
        super.setY(newY);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float newZ) {
        this.z = newZ;
    }

    public void setXYZ(float newX, float newY, float newZ) {
        super.setX(newX);
        super.setY(newY);
        this.z = newZ;
    }

    public float[] getXYZ() {
        return new float[] {this.getX(), this.getY(), this.z};
    }

    public String toString () {
        return Arrays.toString(this.getXYZ());
    }
}
