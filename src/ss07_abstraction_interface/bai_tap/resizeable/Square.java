package ss07_abstraction_interface.bai_tap.resizeable;

public class Square extends Shape {
    private double dimension;

    public Square() {
    }

    public Square(double dimension) {
        this.dimension = dimension;
    }

    public Square(String color, boolean filled, double dimension) {
        super(color, filled);
        this.dimension = dimension;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    public double getArea() {
        return this.dimension * this.dimension;
    }

    public void resize(double percent) {
        System.out.println(
                "Diện tích hình vuông trước khi resize: " + this.getArea() +
                        "; và sau khi resize: " + this.getArea() * percent
        );
    }
}
