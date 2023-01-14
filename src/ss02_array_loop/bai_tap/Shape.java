package ss02_array_loop.bai_tap;

import java.util.Scanner;

public class Shape {
    static Scanner sc = new Scanner(System.in);
    static byte h;
    static byte w;
    static byte i;
    static byte j;

    public static void main(String[] args) {
        // In hình chữ nhật
        System.out.println("Nhập chiều cao hình chữ nhật");
        h = sc.nextByte();
        System.out.println("Nhập chiều rộng hình chữ nhật");
        w = sc.nextByte();
        String[][] rec = new String[h][w];
        for (i = 0; i < h; i++) {
            for (j = 0; j < w; j++) {
                rec[i][j] = "*";
                System.out.print(rec[i][j]);
            }
            System.out.println("");
        }

        // In hình tam giác vuông 1
        System.out.println("Nhập cạnh của hình tam giác 1");
        h = sc.nextByte();
        String[][] triangle1 = new String[h][h];
        for (i = 0; i < h; i++) {
            for (j = 0; j <= i; j++) {
                triangle1[i][j] = "*";
                System.out.print(triangle1[i][j]);
            }
            System.out.println("");
        }

        // In hình tam giác vuông 2
        System.out.println("Nhập cạnh của hình tam giác 2");
        h = sc.nextByte();
        String[][] triangle2 = new String[h][h];
        for (i = 0; i < h; i++) {
            for (j = 0; j < h; j++) {
                if (j < i) triangle2[i][j] = " ";
                else triangle2[i][j] = "*";
                System.out.print(triangle2[i][j]);
            }
            System.out.println("");
        }

        // In hình tam giác vuông 3
        System.out.println("Nhập cạnh của hình tam giác 3");
        h = sc.nextByte();
        String[][] triangle3 = new String[h][h];
        for (i = 0; i < h; i++) {
            for (j = 0; j < h; j++) {
                if (j < h - i) triangle3[i][j] = "*";
                else triangle3[i][j] = " ";
                System.out.print(triangle3[i][j]);
            }
            System.out.println("");
        }

        // In hình tam giác vuông 4
        System.out.println("Nhập cạnh của hình tam giác 4");
        h = sc.nextByte();
        String[][] triangle4 = new String[h][h];
        for (i = 0; i < h; i++) {
            for (j = 0; j < h; j++) {
                if (j >= h - i - 1) triangle4[i][j] = "*";
                else triangle4[i][j] = " ";
                System.out.print(triangle4[i][j]);
            }
            System.out.println("");
        }

        // In hình tam giác vuông 5
        System.out.println("Nhập chiều cao hình tam giác 5");
        h = sc.nextByte();
        String[][] triangle5 = new String[h][2 * h + 1];
        for (i = 0; i < h; i++) {
            for (j = 0; j < 2 * h + 1; j++) {
                if (j >= h - i && j <= h + i) triangle5[i][j] = "*";
                else triangle5[i][j] = " ";
                System.out.print(triangle5[i][j]);
            }
            System.out.println("");
        }
    }
}
