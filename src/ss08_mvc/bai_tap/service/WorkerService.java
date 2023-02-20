package ss08_mvc.bai_tap.service;

import ss08_mvc.bai_tap.model.Worker;

public interface WorkerService {
    Worker[] findAll();

    void addWorker(Worker worker);

    void alterWorker(int id);
}
