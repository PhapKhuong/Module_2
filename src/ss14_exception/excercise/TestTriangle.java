package ss14_exception.excercise;

import java.util.Scanner;

public class TestTriangle {
    public static Scanner scanner = new Scanner(System.in);

    public static Triangle triangle = new Triangle();

    public static void declareTriangle() throws IllegalTriangleException {
        System.out.println("Nhập vào độ dài 3 cạnh cảu một tam giác");

        System.out.println("Nhập vào cạnh a:");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào cạnh b:");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào cạnh a:");
        int c = Integer.parseInt(scanner.nextLine());

        triangle.check(a, b, c);

        System.out.println("Tam giác có độ dài 3 cạnh là: " + a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
        try {
            TestTriangle.declareTriangle();
        } catch (IllegalTriangleException e) {
            System.out.println("Các cạnh nhập vào không phải một tam giác");
        }
    }
}
