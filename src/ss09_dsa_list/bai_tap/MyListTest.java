package ss09_dsa_list.bai_tap;

import ss08_mvc.bai_tap.model.Worker;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();

        Integer[] str = new Integer[]{1, 2, 3, 4};

        myList.setElements(str);

        myList.add(0, 10);

        System.out.println("Phan tu bi xoa: " + myList.remove(2));

        System.out.println("Do lon cua mang hien tai: " + myList.getSize());

        System.out.println("Mang hien tai la: " + Arrays.toString(myList.getElements()));

//=========================================================================

        System.out.println("================================");

        ArrayList<Worker> arr = new ArrayList<Worker>();
        Worker w1 = new Worker(1, "A", "B");
        Worker w2 = new Worker(2, "C", "D");

        arr.add(0, w1);
        arr.add(1, w2);

        arr.remove(1);

        System.out.println(arr);
        System.out.println(arr.toArray());

    }
}