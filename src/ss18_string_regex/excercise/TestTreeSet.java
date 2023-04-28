package ss18_string_regex.excercise;

import java.time.LocalDate;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> mySet = new TreeSet<>();

        System.out.println(mySet.add(1));
        System.out.println(mySet.add(2));
        System.out.println(mySet.add(3));
        System.out.println(mySet.add(1));

        for (Integer i : mySet) {
            System.out.println(i);
        }

        LocalDate d = LocalDate.of(1991, 7, 29);
        int y = d.getYear();
        System.out.println(y);

        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        for (Integer i : myStack) {
            System.out.println(i);
        }
        System.out.println("==============");
        System.out.println(myStack.pop());

        System.out.println("==============");

        for (Integer i : myStack) {
            System.out.println(i);
        }



    }
}
