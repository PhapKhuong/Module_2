package ss08_mvc.excercise.service;

import ss08_mvc.excercise.model.Worker;

public interface WorkerService {
    Worker[] findAll();

    void addWorker(Worker worker);

    void alterWorker(int id);
}
