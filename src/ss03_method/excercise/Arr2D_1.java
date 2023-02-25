package ss03_method.excercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tìm phần tử lớn nhất trong mảng hai chiều
 */

public class Arr2D_1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        showInformation();
    }

    public static void showInformation() {
        System.out.println("Nhập vào mảng 2 chiều");
        System.out.println("Nhập vào số hàng của mảng");
        int r = sc.nextInt();
        System.out.println("Nhập vào số cột của mảng");
        int c = sc.nextInt();

        double[][] nums = new double[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Nhập vào phần tử hàng " + i + "; " + "cột " + j);
                nums[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + findMax(nums));
        System.out.println("Vị trí của số lớn nhất là " + findLocation(nums));
    }

    public static double findMax(double[][] numbers) {
        double max = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (max < numbers[i][j]) max = numbers[i][j];
            }
        }
        return max;
    }

    public static String findLocation(double[][] numbers) {
        double max = findMax(numbers);
        int[] xy = {0, 0};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == max) xy = new int[]{i, j};
            }
        }
        return Arrays.toString(xy);
    }
}

// Muốn return ra một mảng thì làm thế nào
/* Vì sao chạy TheFirst.java không có lỗi gì, không chạy Arr2D.java
 * nhưng lại báo lỗi ở file Arr2D.java?
 */
