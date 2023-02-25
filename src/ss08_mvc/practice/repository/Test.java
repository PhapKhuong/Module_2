package ss08_mvc.practice.repository;

import ss08_mvc.practice.service.StudentService;

public interface Test extends StudentRepository, StudentService {
    void abc();
}
