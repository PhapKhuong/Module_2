package ss02_array_loop.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2 {
    static Scanner sc = new Scanner(System.in);
    static int arr1[];
    static int arr2[];
    static int arr3[];

    public static void main(String[] args) {
        System.out.println("NHẬP VÀO MẢNG 1");
        System.out.println("Nhập vào độ dài của mảng 1");
        byte len1 = sc.nextByte();
        arr1 = new int[len1];
        for (byte i = 0; i < len1; i++) {
            System.out.println("Nhập vào giá trị của phần tử thứ " + i);
            arr1[i] = sc.nextByte();
        }
        System.out.println("Mảng số 1 là: " + Arrays.toString(arr1));

        System.out.println("NHẬP VÀO MẢNG 2");
        System.out.println("Nhập vào độ dài của mảng 2");
        byte len2 = sc.nextByte();
        arr2 = new int[len2];
        for (byte i = 0; i < len2; i++) {
            System.out.println("Nhập vào giá trị của phần tử thứ " + i);
            arr2[i] = sc.nextByte();
        }
        System.out.println("Mảng số 2 là: " + Arrays.toString(arr2));

        // HIỂN THỊ MẢNG 3
        int len = len1 + len2;
        arr3 = new int[len];
        for (byte i = 0; i < len; i++) {
            if (i < len1) arr3[i] = arr1[i];
            else arr3[i] = arr2[i - len1];
        }
        System.out.println("Mảng số 3 là: " + Arrays.toString(arr3));

    }
}