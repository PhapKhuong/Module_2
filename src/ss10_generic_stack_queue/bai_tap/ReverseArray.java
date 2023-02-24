package ss10_generic_stack_queue.bai_tap;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        System.out.println("Nhập số phần tử muốn thêm vào mảng:");
        int size = sc.nextInt();

        int[] myNums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ: " + i);
            myNums[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++) {
            numbers.push(myNums[i]);
        }

        System.out.println("Mảng ban đầu là: " + numbers);

        for (int i = 0; i<size;i++) {
            myNums[i] = numbers.pop();
        }

        for (int i = 0; i< size; i++) {
            numbers.push(myNums[i]);
        }

        System.out.println("Mảng sau khi đảo: " + numbers);
    }
}