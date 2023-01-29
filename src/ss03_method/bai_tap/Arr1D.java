package ss03_method.bai_tap;

import java.util.Scanner;

/**
 * Tìm giá trị nhỏ nhất trong mảng
 */
public class Arr1D {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        showMin();
    }

    public static void showMin() {
        System.out.println("Nhập vào độ lớn của mảng");
        int len = sc.nextInt();
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Nhập vào giá trị phần tử thứ " + i);
            numbers[i] = sc.nextInt();
        }
        System.out.println("Phần tử có giá trị nhỏ nhất trong mảng là: " + findMin(numbers));
    }

    public static int findMin(int[] nums) {
        int len = nums.length; // Vì sao khai báo len kiểu byte phải ép kiểu dữ liệu về int?????
        int min = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] < min) min = nums[i];
        }
        return min;
    }
}
