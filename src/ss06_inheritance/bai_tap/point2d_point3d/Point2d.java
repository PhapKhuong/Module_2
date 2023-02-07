package ss06_inheritance.bai_tap.point2d_point3d;

import java.util.Arrays;

public class Point2d {
    private float x;
    private float y;

    public Point2d() {
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float newX) {
        this.x = newX;
    }

    public float getY() {
        return y;
    }

    public void setY(float newY) {
        this.y = newY;
    }

    public void setXY(float newX, float newY) {
        this.x = newX;
        this.y = newY;
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    public String toString () {
        return Arrays.toString(this.getXY());
    }
}
