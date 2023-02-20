package ss08_mvc.thuc_hanh.repository;

import ss08_mvc.thuc_hanh.model.Student;

public interface StudentRepository {
    /*CRUD*/
    Student[] findAll();

    void addStudent(Student student);
}
