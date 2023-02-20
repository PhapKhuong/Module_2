package ss08_mvc.bai_tap.service;

import ss08_mvc.bai_tap.model.Worker;
import ss08_mvc.bai_tap.repository.WorkerRepository;
import ss08_mvc.bai_tap.repository.WorkerRepositoryImpl;

public class WorkerServiceImpl implements WorkerService {
    public WorkerRepository repository = new WorkerRepositoryImpl();

    public WorkerServiceImpl() {
    }

    @Override
    public Worker[] findAll() {
        return repository.findAll();
    }

    @Override
    public void addWorker(Worker worker) {

    }

    @Override
    public void alterWorker(int id) {

    }
}
