package mycleann;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker {
	static Logger logger = Logger.getLogger(Worker.class.getName());

    private String name;
    private boolean available;
    private Orderr assignedOrder;
    private List<Orderr> orders;

    public Worker(String name) {
        this.name = name;
        this.available = true;
        this.orders = new ArrayList();

    }

    public void assignOrder(Orderr order) {
        this.assignedOrder = order;
        this.available = false;
    }

    public void completeOrderr() {
        this.assignedOrder = null;
        this.available = true;
    }
    
    public String getName() {
        return name;
      }

    public boolean isAvailable() {
        return available;
    }
    
    public void assignOrders(List<Orderr> orders) {
        this.orders = orders;
        logger.log(Level.INFO,name + " has been assigned " + orders.size() + " orders:");
        for (Orderr order : orders) {
        	logger.log(Level.INFO,"- " + order.getName());
        }
      }
}