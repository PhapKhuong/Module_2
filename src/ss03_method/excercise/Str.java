package ss03_method.excercise;

import java.util.Scanner;

/**
 * Đếm số lần xuất hiện của ký tự trong chuỗi
 */
public class Str {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        countChar();
    }

    public static void countChar() {
        System.out.println("Nhập vào một chuỗi ký tự");
        String str = sc.nextLine();
        System.out.println("Nhập vào ký tự cần kiểm tra");
        char w = sc.nextLine().charAt(0);
        int len = str.length(); // Vì sao biến len chọn kiểu byte hoặc short không được
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == w) count += 1;
        }
        System.out.println("Số lần xuất hiện của " + w + "trong chuỗi là: " + count);
        sc.close();
    }
}
