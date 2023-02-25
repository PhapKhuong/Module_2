package ss08_mvc.practice.repository;

import ss08_mvc.practice.model.Student;

public interface StudentRepository {
    /*CRUD*/
    Student[] findAll();

    void addStudent(Student student);
}
