package ss05_static.excercise;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Phil Foden");
        student.setClasses("A10");

        System.out.println("Tên - lớp của sinh viên là: " + student.displayInformation());
    }
}