package ss07_abstraction_interface.thuc_hanh;

import ss07_abstraction_interface.bai_tap.resizeable.Circle;
import ss07_abstraction_interface.bai_tap.resizeable.Rectangle;
import ss07_abstraction_interface.bai_tap.resizeable.Shape;

public class ShapeTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle();
        shapes[1] = new Circle();

        for(Shape shape : shapes) {
            if (shape instanceof Circle) {
                // vào được đây thì shape chính là Circle lúc runtime
                ((Circle)shape).getColor();
            } else if (shape instanceof Rectangle) {
                // vào được đây thì shape chính là Rectangle lúc runtime
            }
        }
        /*
        compile => Khi chưa chạy chương trình => Phụ thuộc vào kiểu dữ liệu

        runtime => Đang chạy chương trình => Phụ thuộc vào đối tượng tham chiếu tới
         */

        // ========== Ép kiểu tường minh & ngầm định ==========
        /*
        tường minh: Lập trình viên chủ động ép kiểu
        ngầm định: Java đã chủ động làm
         */
        int a1 = 2;
        long b1 = a1; // ép kiểu ngầm định => không bị mất mát dữ liệu

        long a2 = 2;
        int b2 = (int) a2; // Ép kiểu tường mình => CÓ thể bị mất mát dữ liệu

        final short x = 23000;
        int usd = 170000000;
        long vnd;
        vnd = usd * x;
    }
}
