package ss04_oop.bai_tap;

import java.util.Scanner;

/**
 * Hiển thị thông tin của quạt
 */
public class FanObject {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setOn(true);
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.toString());
    }
}
