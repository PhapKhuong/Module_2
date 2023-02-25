package ss07_abstraction_interface.excercise.colorable;

public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Square(10);

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Diện tích hình tròn là: " + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("Diện tích hình chữ nhật là: " + ((Rectangle) shape).getArea());
            } else if (shape instanceof Square) {
                System.out.println("Diện tích hình vuông là: " + ((Square) shape).getArea());
                ((Square) shape).howToColor();
            } else {
                System.out.println("No information");
            }
        }
    }
}
