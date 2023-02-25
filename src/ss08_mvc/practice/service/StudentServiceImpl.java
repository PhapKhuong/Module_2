package ss08_mvc.practice.service;

import ss08_mvc.practice.model.Student;
import ss08_mvc.practice.repository.StudentRepository;
import ss08_mvc.practice.repository.StudentRepositoryImpl;

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
