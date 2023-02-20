package ss08_mvc.bai_tap.repository;

import ss08_mvc.bai_tap.model.Worker;

public interface WorkerRepository {
    Worker[] findAll();

    void addWorker(Worker worker);

    void alterWorker (int id);
}
