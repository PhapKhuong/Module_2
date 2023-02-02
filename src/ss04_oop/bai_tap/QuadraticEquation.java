package ss04_oop.bai_tap;

/**
 * Tạo lớp Phương trình bậc 2
 */

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
        this(0,0,0);
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double newA) {
        this.a = newA;
    }

    public void setB(double newB) {
        this.b = newB;
    }

    public void setC(double newC) {
        this.c = newC;
    }

    public double getDiscriminant() {
        double delta = this.getB() * this.getB() - 4 * this.getA() * this.getC();
        return delta;
    }
}

