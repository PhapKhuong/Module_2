package ss06_inheritance.excercise.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this(1, "white", "no fill", 1);
    }

    public Cylinder(double radius, String border, String filler, double height) {
        super(radius, border, filler);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public double getVolume() {
        return height * super.getArea();
    }
}
