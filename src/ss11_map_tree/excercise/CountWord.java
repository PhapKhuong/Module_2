package ss11_map_tree.excercise;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhập vào một chuỗi bất kỳ");
        String str = sc.nextLine().toLowerCase(Locale.ROOT);
        String[] wordArr = str.split(" ");

        Map<String, Integer> wordTreeMap = new TreeMap<>();

        int value;

        for (int i = 0; i < wordArr.length; i++) {
            if (wordTreeMap.containsKey(wordArr[i])) {
                value = wordTreeMap.get(wordArr[i]);
                wordTreeMap.put(wordArr[i], value + 1);
            } else {
                wordTreeMap.put(wordArr[i], 1);
            }
        }

        for (String key : wordTreeMap.keySet()) {
            System.out.println(key + " - " + wordTreeMap.get(key));
        }
    }
}
