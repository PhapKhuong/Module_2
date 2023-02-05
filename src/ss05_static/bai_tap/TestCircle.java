package ss05_static.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(1);
        circle.setColor("red");

        System.out.println("Bán kính của hình tròn là: " + circle.getRadius());

        System.out.println("Diện tích hình tròn theo method không tham số: " + circle.getArea());

        System.out.println("Diện tích hình tròn theo method có tham số radius: " + circle.getArea(circle.getRadius()));
    }
}
