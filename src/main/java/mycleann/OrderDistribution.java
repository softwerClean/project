package mycleann;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class OrderDistribution {

    private Queue<Orderr> orders = new ArrayBlockingQueue<Orderr>(100);
    private List<Worker> workers = new ArrayList<Worker>();

    public void addOrderr(Orderr order) {
        orders.offer(order);
        assignOrders();
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
        assignOrders();
    }

    private void assignOrders() {
        for (Worker worker : workers) {
            if (worker.isAvailable()) {
                Orderr order = orders.poll();
                if (order != null) {
                    worker.assignOrder(order);
                }
            }
        }
    }
}
