package ss01_introduction_java.excercise;

import java.util.Scanner;

public class Money {
    final static short RATE = 23000;
    static Scanner sc;
    static int usd;
    static long vnd;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD cần quy đổi: ");
        usd = sc.nextInt();
        vnd = (long) usd * RATE;
        System.out.println("Số tiền VNĐ tương ứng là: " + vnd);
    }
}
