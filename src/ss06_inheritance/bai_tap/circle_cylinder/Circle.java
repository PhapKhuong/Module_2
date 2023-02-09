package ss06_inheritance.bai_tap.circle_cylinder;

public class Circle {
    private double radius;
    private String border;
    private String filler;

    public Circle() {
        this(1, "white", "no fill");
    }

    public Circle(double radius, String border, String filler) {
        this.radius = radius;
        this.border = border;
        this.filler = filler;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String newBorder) {
        this.border = newBorder;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String newFiller) {
        this.filler = newFiller;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
