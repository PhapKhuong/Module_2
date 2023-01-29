package ss03_method.bai_tap;

import java.util.Scanner;

/**
 * Tính tổng các số ở đường chéo chính của ma trận vuông
 */
public class Arr2D_3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        findDiagonalTotal();
    }

    public static void findDiagonalTotal() {
        System.out.println("Nhập vào kích thước của ma trận");
        byte d = sc.nextByte();
        double[][] nums = new double[d][d];
        for (byte i = 0; i < d; i++) {
            for (byte j = 0; j < d; j++) {
                System.out.println("Nhập vào phần tử hàng " + i + "; cột" + j);
                nums[i][j] = sc.nextDouble();
            }
        }
        double total = 0;
        for (byte t = 0; t < d; t++) {
            total += nums[t][t];
        }
        System.out.println("Tổng các số của hàng chéo chính là: " + total);
    }
}