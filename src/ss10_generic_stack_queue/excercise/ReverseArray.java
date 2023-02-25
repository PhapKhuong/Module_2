package ss10_generic_stack_queue.excercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // ĐẢO NGƯỢC MẢNG:
        System.out.println("Nhập số phần tử muốn thêm vào mảng:");
        int size = Integer.parseInt(sc.nextLine());

        int[] myNums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ :" + i);
            myNums[i] = Integer.parseInt(sc.nextLine());
        }

        reverseNumber(myNums);

        // ĐẢO NGƯỢC CHUỖI:
        System.out.println("Nhập vào một chuỗi bất kỳ:");
        String str = sc.nextLine();

        reverseString(str);
    }

    public static void reverseNumber(int[] nums) {
        Stack<Integer> numbers = new Stack<>();
        int[] tempNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numbers.push(nums[i]);
        }

        System.out.println("Mảng ban đầu là: " + numbers);

        for (int i = 0; i < nums.length; i++) {
            tempNums[i] = numbers.pop();
        }

        for (int i = 0; i < nums.length; i++) {
            numbers.push(tempNums[i]);
        }

        System.out.println("Mảng sau khi đảo: " + numbers);
    }

    public static void reverseString(String str) {
        String[] strArr = str.split(" ");

        Stack<String> stackArr = new Stack<>();
        for (int i = 0; i < strArr.length; i++) {
            stackArr.push(strArr[i]);
        }

        int i = 0;
        while (!stackArr.empty()) {
            strArr[i] = stackArr.pop();
            i++;
        }

        System.out.println(Arrays.toString(strArr));
    }
}