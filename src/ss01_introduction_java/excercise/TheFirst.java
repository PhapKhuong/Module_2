package ss01_introduction_java.excercise;

import java.util.Scanner;

public class TheFirst {
    static String name;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn:");
        name = sc.nextLine();
        System.out.println("Xin chào " + name);
    }
}
