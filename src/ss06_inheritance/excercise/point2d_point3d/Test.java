package ss06_inheritance.excercise.point2d_point3d;

public class Test {
    public static void main(String[] args) {
        // Test lớp Point2d
        Point2d p2d = new Point2d(1, 2);
        System.out.println("Tọa độ của điểm 1 là: " + p2d.toString());

        // Test lớp Point3d
        Point3d p3d = new Point3d(7, 8, 9);
        System.out.println("Tọa độ của điểm 2 là: " + p3d.toString());

        p3d.setX(11);
        p3d.setY(12);
        p3d.setZ(13);
        System.out.println("Tọa độ của điểm 3 là: " + p3d.toString());

        p3d.setXYZ(14, 15, 16);
        System.out.println("Tọa độ của điểm 4 là: " + p3d.toString());

        Point2d p3d1 = new Point3d();
        p3d1.setX(21);
        p3d1.setY(22);
        System.out.println("Tọa độ của điểm 5 là: " + p3d1.toString());
    }
}
