package ss12_search.excercise.complexity.ss16_binary_file.excercise;

import java.io.*;
import java.util.List;

public class ByteStream {
    public static final String FILE_PATH =
            "C:\\Dropbox\\Codegym\\Module2\\src\\ss12_search.excercise.complexity.ss16_binary_file\\excercise\\student.dat";

    public static void writeObject(Student student) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.close();
    }

    public static Student readObject() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = (Student) ois.readObject();
        ois.close();
        return student;
    }

    public static void writeObjectList(List<Student> studentList) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(studentList);
        oos.close();
    }

    public static List<Student> readObjectList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Student> studentList = (List<Student>) ois.readObject();
        ois.close();
        return studentList;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student(1, "Hung", 99);
        writeObject(student);
        System.out.println(readObject());
    }
}
