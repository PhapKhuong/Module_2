package ss06_inheritance.bai_tap.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        // Kiểm tra lớp Circle
        Circle circle = new Circle();
        circle.setRadius(2);
        circle.setBorder("grey");
        circle.setFiller("pink");

        System.out.println("Diện tích hình tròn là: " + circle.getArea());

        // Kiểm tra lớp Cylinder
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5);
        cylinder.setBorder("blue");
        cylinder.setFiller("yellow");
        cylinder.setHeight(10);

        System.out.println("Thể tích hình trụ là: " + cylinder.getVolume());
    }
}
