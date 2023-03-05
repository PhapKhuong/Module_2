package ss13_sort.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử của mảng cần sắp xếp");
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + " của mảng:");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Mảng ban đầu là: " + Arrays.toString(numbers));
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(insertionSort(numbers)));
    }

    public static int[] insertionSort(int[] numArr) {
        int len = numArr.length;

        for (int i = 0; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (numArr[j] < numArr[j - 1]) {
                    int temp = numArr[j - 1];
                    numArr[j - 1] = numArr[j];
                    numArr[j] = temp;
                } else {
                    break;
                }
            }
        }
        return numArr;
    }

}
