package ss10_generic_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    static Scanner sc = new Scanner(System.in);
    static int quotient;

    public static void main(String[] args) {
        System.out.println("Nhập vào một số thập phân bất kỳ:");
        int number = sc.nextInt();

        Stack<Byte> binaryArr = new Stack();

        quotient = number;
        while (quotient > 0) {
            byte mod = (byte) (quotient % 2);
            binaryArr.push(mod);
            quotient = (int) (quotient/2);
        }
        String str = "";

        while (!binaryArr.empty()) {
            str += binaryArr.pop();
        }

        System.out.println("Số nhị phân của " + number + " là: " + str);
    }
}