package ss06_inheritance.excercise.point2d_point3d;

public class Point3d extends Point2d {
    private float z;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float newZ) {
        this.z = newZ;
    }

    public void setXYZ(float newX, float newY, float newZ) {
        this.setX(newX);
        this.setY(newY);
        this.z = newZ;
    }

    public float[] getXYZ() {
        return new float[] {this.getX(), this.getY(), this.z};
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ", " + this.z + ")";
    }
}
