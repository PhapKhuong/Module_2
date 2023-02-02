package ss04_oop.bai_tap;

/**
 * Giải phương trình bậc 2
 */

import java.util.Scanner;

public class Answer {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập vào hệ số a:");
        double a = sc.nextDouble();
        System.out.println("Nhập vào hệ số b:");
        double b = sc.nextDouble();
        System.out.println("Nhập vào hệ số c:");
        double c = sc.nextDouble();

        QuadraticEquation equa = new QuadraticEquation();
        equa.setA(a);
        equa.setB(b);
        equa.setC(c);
        //Nếu khởi tạo  ban đầu không có tham số đầu vào, sau đó mới setter tham số sau thì đối tượng có tương đương với khởi tạo đầy đủ không
        double d = equa.getDiscriminant();

        if (d > 0)
            System.out.println("The equation has two roots: " + (-equa.getB() + Math.pow(d, 0.5)) / (2 * equa.getA()) + " and " + (-equa.getB() - Math.pow(d, 0.5)) / (2 * equa.getA()));
        else if (d == 0) System.out.println("The equation has one root: " + -equa.getB() / (2 * equa.getA()));
        else System.out.println("The equation has no real root");
    }
}