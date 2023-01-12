package ss02_array_loop.bai_tap;

import java.awt.*;
import java.util.Scanner;

public class PrimeNumber {
    static Scanner sc = new Scanner(System.in);
    static short i;
    static byte num;

    public static void main(String[] args) {
        // Hiển thị 20 số nguyên tố đầu tiên
        System.out.println("Nhập số lượng số nguyên tố đầu tiên cần tìm");
        byte q = sc.nextByte();
        System.out.print("20 số nguyên tố đầu tiên là: 2; ");
        byte count = 1;
        short x = 3;
        while (count < q) {
            boolean test = false;
            for (i = 2; i < x; i++) {
                if (x % i == 0) {
                    test = true;
                    break;
                }
            }
            if (!test) {
                count += 1;
                System.out.print(x + "; ");
            }
            x += 1;
        }

        // Hiển thị các số nguyên tố nhỏ hơn 100
        System.out.println("");
        String str = "2; ";
        for (num = 3; num < 100; num++) {
            boolean checkNum = false;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    checkNum = true;
                    break;
                }
            }
            if (!checkNum) str += num + "; ";
        }
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: " + str );
    }
}
