package ss02_array_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_1 {
    static short arr[];
    static Scanner sc = new Scanner(System.in);
    static byte len;

    public static void main(String[] args) {
        // Xóa phần tử khỏi mảng
        System.out.println("BÀI XÓA PHẦN TỬ TRONG MẢNG");
        System.out.println("Nhập vào độ lớn của mảng");
        len = sc.nextByte();
        arr = new short[len];
        for (byte i = 0; i < len; i++) {
            System.out.println("Nhập vào giá trị của phần tử " + i);
            arr[i] = sc.nextShort();
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));
        System.out.println("Nhập vào giá trị của phần tử cần xóa");
        short del = sc.nextShort();
        byte t = 0;
        byte count = 0;
        String str = "";
        while (t < len) {
            if (arr[t] == del) {
                if (del == 0) {
                    System.out.println("Không thể xóa hết phần tử có giá trị 0 trong mảng");
                    count = -1;
                    break;
                } else {
                    for (byte j = t; j < len; j++) {
                        if (j == len - 1) arr[j] = 0;
                        else arr[j] = arr[j + 1];
                    }
                    count += 1;
                    str += t + count - 1 + "; ";
                }
            } else t += 1;
        }
        System.out.println("Mảng sau khi xóa là: " + Arrays.toString(arr));
        if (count == 0) System.out.println("Không có phần tử này trong mảng");
        else if (count == -1) System.out.println("Kết thúc chương trình");
        else System.out.println("Có " + count + " phần tử cần xóa, tại vị trí: " + str);

        // Thêm phần tử vào mảng
        System.out.println("BÀI THÊM PHẦN TỬ VÀO MẢNG");
        System.out.println("Nhập vào độ lớn của mảng");
        len = sc.nextByte();
        arr = new short[len];
        for (byte i = 0; i < len; i++) {
            System.out.println("Nhập vào giá trị của phần tử " + i);
            arr[i] = sc.nextShort();
        }
        System.out.println("Mảng ban đầu là: " + Arrays.toString(arr));

        System.out.println("Nhập vào giá trị cần thêm vào mảng");
        short add = sc.nextShort();
        System.out.println("Nhập vào vị trí cần thêm vào mảng");
        byte id = sc.nextByte();
        for (int i = len - 1; i >= id; i--) { //Vì sao để i kiểu byte lại báo lỗi; nếu i = len, để byte không bị lỗi nữa
            if (i == id) arr[i] = add;
            else arr[i] = arr[i - 1];
        }
        System.out.println("Mảng sau khi thêm là: " + Arrays.toString(arr));
    }
}
