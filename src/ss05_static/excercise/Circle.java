package ss05_static.excercise;

public class Circle {
    static final double PI = 3.14;

    private double radius;
    private String color;

    public Circle() {
        this(0, "black");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double area = PI * this.radius * this.radius;
        return area;
    }

    public double getArea(double radius) {
        double area = PI * radius * radius;
        return area;
    }
}
