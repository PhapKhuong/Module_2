package ss08_mvc.thuc_hanh.service;

import ss08_mvc.thuc_hanh.model.Student;
import ss08_mvc.thuc_hanh.repository.StudentRepository;
import ss08_mvc.thuc_hanh.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService{
    private StudentRepository repository = new StudentRepositoryImpl();

    @Override
    public Student[] findAll() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        repository.addStudent(student);
    }
}
