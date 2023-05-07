package mycleann;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrderDistributor {
	static Logger logger = Logger.getLogger(FirstClass.class.getName());

  private List<Worker> availableWorkers;
  
  public OrderDistributor(List<Worker> availableWorkers) {
    this.availableWorkers = availableWorkers;
  }
  
  public void distributeOrders(List<Orderr> orders) {
    int numOrders = orders.size();
    int numWorkers = availableWorkers.size();
    
    if (numWorkers == 0) {
    	logger.log(Level.INFO,"No workers available to distribute orders");
      return;
    }
    
    if (numOrders > numWorkers) {
    	logger.log(Level.INFO,"There are more orders than workers available");
    }
    
    int ordersPerWorker = numOrders / numWorkers; 
    int remainingOrders = numOrders % numWorkers;
    
    int currentOrderIndex = 0;
    for (int i = 0; i < numWorkers; i++) {
      Worker worker = availableWorkers.get(i);
      
      int numWorkerOrders = ordersPerWorker;
      if (i < remainingOrders) {
        numWorkerOrders++; 
      }
      
      List<Orderr> workerOrders = new ArrayList();
      for (int j = 0; j < numWorkerOrders; j++) {
        if (currentOrderIndex >= numOrders) {
          break; 
        }
        Orderr order = orders.get(currentOrderIndex);
        workerOrders.add(order);
        currentOrderIndex++;
      }
      
      worker.assignOrders(workerOrders);
    }
  }
}