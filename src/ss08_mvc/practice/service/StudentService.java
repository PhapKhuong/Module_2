package ss08_mvc.practice.service;

import ss08_mvc.practice.model.Student;

public interface StudentService {
    //CRUD, sort, search
    Student[] findAll();

    void addStudent(Student student);

    //Validation

}
