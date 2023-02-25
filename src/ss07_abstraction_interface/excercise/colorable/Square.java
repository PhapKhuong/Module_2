package ss07_abstraction_interface.excercise.colorable;

public class Square extends Shape implements IColorable{
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

    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
