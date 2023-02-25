package ss08_mvc.excercise.service;

import ss08_mvc.excercise.model.Worker;
import ss08_mvc.excercise.repository.WorkerRepository;
import ss08_mvc.excercise.repository.WorkerRepositoryImpl;

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
