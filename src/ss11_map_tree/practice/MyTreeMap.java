package ss11_map_tree.practice;

import ss08_mvc.practice.model.Student;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<Student, Integer> myMap = new TreeMap<>();

        Student student1 = new Student(1,"A");
        Student student2 = new Student(2,"B");
        Student student3 = new Student(3,"C");
        Student student4 = new Student(4,"D");

        myMap.put(student1,11);
        myMap.put(student2,22);
        myMap.put(student3,33);
        myMap.put(student4,44);

        for (Student key : myMap.keySet()) {
            System.out.println(key + "-" + myMap.get(key));
        }

        for(Map.Entry entry : myMap.entrySet()) {
            myMap.put((Student) entry.getKey(), (Integer) entry.getValue()+1);
        }

        for (Map.Entry entry : myMap.entrySet()) {
            System.out.println(entry.getKey() instanceof Student);
            System.out.println(entry.getValue() instanceof Integer);
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
