package ss14_exception.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DemoException {
    public static Scanner scanner = new Scanner(System.in);

    public static void readFile() throws FileNotFoundException {
//        try{
//            FileReader fileReader = new FileReader("abc");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        FileReader fileReader = new FileReader("abc");
    }

    public static int input() {
        int n1 = 0;
        int n2 = 0;
        int x = 0;
        try {
            System.out.println("Nhập vào số thứ 1:");
            n1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhập vào số thứ 2:");
            n2 = Integer.parseInt(scanner.nextLine());

            if (n1 == 13 || n2 == 13) {
                throw new MyException();
            }

            x = n1 / n2;

        } catch (NumberFormatException e) {
            System.out.println("Nhập vào một số");
        } catch (ArithmeticException e) {
            System.out.println("Số chia không được nhận giá trị 0");
        } catch (MyException e) {
            System.out.println("Không được lấy số 13");
        } finally {
            System.out.println("Kết thúc chương trình");
        }
        return x;
    }

    public static void main(String[] args){
        System.out.println(input());
        try {
            DemoException.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thấy file");
        }
    }
}
