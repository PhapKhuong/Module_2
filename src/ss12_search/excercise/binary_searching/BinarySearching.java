package ss12_search.excercise.binary_searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearching {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập vào số lượng phần tử của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            numbers[i] = Integer.parseInt(scanner.nextLine());
            for (int j = i; j > 0; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        System.out.println("Nhập giá trị cần tìm:");
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("Mảng ban đầu: " + Arrays.toString(numbers));
        System.out.println("Vị trí " + num + " cần tìm trong dãy ban đầu là: " + binarySearch(num, numbers));
    }

    public static int binarySearch(int value, int[] numArr) {
        int left = 0;
        int right = numArr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (numArr[mid] == value) {
                return mid;
            } else if (numArr[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}