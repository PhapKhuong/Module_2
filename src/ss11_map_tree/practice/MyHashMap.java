package ss11_map_tree.practice;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap();
        myMap.put("A", 1);
        myMap.put("B", 2);
        myMap.put("C", 3);

        for (String key : myMap.keySet()) {
            System.out.println(key + " - " + myMap.get(key));
        }

        for (Map.Entry keyValue : myMap.entrySet()) {
            System.out.println(keyValue.getKey() + " - " + keyValue.getValue());
        }
    }
}
