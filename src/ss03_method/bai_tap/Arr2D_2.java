package ss03_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tính tổng các số ở một cột xác định
 */
public class Arr2D_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        showTotal();
        findTotal(1);
    }

    public static void showTotal() {
        System.out.println("Nhập vào số hàng của mảng");
        byte r = sc.nextByte();
        System.out.println("Nhập vào số cột của mảng");
        byte c = sc.nextByte();
        double[][] numbers = new double[r][c];
        String str = "";
        for (byte i = 0; i < r; i++) {
            for (byte j = 0; j < c; j++) {
                System.out.println("Nhập vào phần tử hàng " + i + "; cột " + j);
                numbers[i][j] = sc.nextDouble();
            }
            str += Arrays.toString(numbers[i]) + "; ";
        }
        System.out.println("Mảng nhập vào là: " + str);
        System.out.println("Nhập vào cột cần tính tổng");
        byte col = sc.nextByte();
        System.out.println("Tổng các phần tử của cột " + col + " trong mảng là: " + findTotal(col, numbers));
    }

    public static double findTotal(byte num, double[][] arr) {
        int r = arr.length; // Vì sao biến r chọn kiểu byte không được???????
        double total = 0;
        for (int i = 0; i < r; i++) {
            total += arr[i][num];
        }
        return total;
    }

    public static double findTotal(int num1) {
        double num2 = num1;
        return num2;
    }
}
