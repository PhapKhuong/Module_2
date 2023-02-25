package ss08_mvc.excercise.repository;

import ss08_mvc.excercise.model.Worker;

import java.util.ArrayList;

public class WorkerRepositoryImpl implements WorkerRepository {
    private static ArrayList<Worker> workers = new ArrayList<Worker>();

    static {
        Worker worker1 = new Worker(1, "A", "X");
        Worker worker2 = new Worker(2, "B", "Y");
        Worker worker3 = new Worker(3, "C", "Z");
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
    }

    public WorkerRepositoryImpl() {
    }

    public Worker[] findAll() {
        Worker[] workerArr = new Worker[workers.size()];
        return workers.toArray(workerArr);
    }

    public void addWorker(Worker worker) {
    }

    public void alterWorker(int id) {
    }
}