package ss07_abstraction_interface.excercise.resizeable;

public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(8);

        for (Shape shape : shapes) {
            double percent = 100 * Math.random();
            shape.resize (percent);
        }
    }
}
