package ss10_generic_stack_queue.excercise;

import java.util.*;

public class TestPalindromeString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập vào chuỗi cần kiểm tra:");
        String str = sc.nextLine();

        String[] strArr = str.split(" ");

        Stack<String> stackStr = new Stack<>();
        for (int i = 0; i < strArr.length; i++) {
            stackStr.push(strArr[i]);
        }

        Queue<String> queueStr = new LinkedList<>();
        for (int i = 0; i < strArr.length; i++) {
            queueStr.offer(strArr[i]);
        }

        boolean check = false;
        while (!stackStr.empty()) {
            if (!stackStr.pop().equals(queueStr.remove())) {
                System.out.println("Chuỗi " + str + " không phải là chuỗi Palindrome!");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Chuỗi " + str + " là chuỗi Palindrome!");
        }
    }
}