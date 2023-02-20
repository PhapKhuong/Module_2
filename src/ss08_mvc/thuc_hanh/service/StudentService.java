package ss08_mvc.thuc_hanh.service;

import ss08_mvc.thuc_hanh.model.Student;

public interface StudentService {
    //CRUD, sort, search
    Student[] findAll();

    void addStudent(Student student);

    //Validation

}
