package ss08_mvc.thuc_hanh.repository;

import ss08_mvc.thuc_hanh.service.StudentService;

public interface Test extends StudentRepository, StudentService {
    void abc();
}
