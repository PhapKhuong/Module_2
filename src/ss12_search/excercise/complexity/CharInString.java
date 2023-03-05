package ss12_search.excercise.complexity;

import java.util.Scanner;

public class CharInString {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập vào một chuỗi bất kỳ");
        String str = scanner.nextLine();

        String[] chars = str.split("");

        String mostChar = null;
        int appearMax = 0;
        int complexity = 0;
        int count;

        int i = 0;
        while (i < chars.length) {
            count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                complexity += 1;
                if (chars[j].equals(chars[i])) {
                    count++;
                    chars[j] = chars[i + count - 1];
                    chars[i + count - 1] = chars[i];
                }
            }
            if (appearMax < count) {
                appearMax = count;
                mostChar = chars[i];
            } else if (appearMax == count) {
                mostChar = mostChar + ", " + chars[i];
            }
            i += count;
        }
        System.out.println("Ký tự '" + mostChar + "' xuất hiện nhiều nhất với số lần là: " + appearMax);
        System.out.println("Độ phức tạp của thuật toán là O(" + complexity + ")");
    }
}
