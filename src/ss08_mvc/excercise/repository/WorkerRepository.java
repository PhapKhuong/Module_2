package ss08_mvc.excercise.repository;

import ss08_mvc.excercise.model.Worker;

public interface WorkerRepository {
    Worker[] findAll();

    void addWorker(Worker worker);

    void alterWorker (int id);
}
