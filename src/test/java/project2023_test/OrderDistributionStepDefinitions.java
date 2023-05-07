package project2023_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.LinkedList;
import java.util.Queue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderDistributionStepDefinitions {

    private Queue<Worker> availableWorkers = new LinkedList();
    private Queue<Orderr> distributionQueue = new LinkedList();
    private Worker assignedWorker;

    @Given("^a worker named \"([^\"]*)\" is available$")
    public void a_worker_named_is_available(String name) {
        assertNotNull(name);
        availableWorkers.offer(new Worker(name));
    }

    @Given("^an order with ID \"([^\"]*)\" and customer name \"([^\"]*)\" is received$")
    public void an_order_with_ID_and_customer_name_is_received(String orderId, String customerName) {
        assertNotNull(orderId);
        assertNotNull(customerName);
        distributionQueue.offer(new Orderr(orderId, customerName));
    }

    @When("^the order is added to the distribution queue$")
    public void the_order_is_added_to_the_distribution_queue() {
        Orderr order = distributionQueue.poll();
        assertNotNull(order);
        assignedWorker = availableWorkers.poll();
        assertNotNull(assignedWorker);
        assignedWorker.assignOrder(order);
    }

    @Then("^the order should be assigned to worker \"([^\"]*)\"$")
    public void the_order_should_be_assigned_to_worker(String expectedWorkerName) {
        assertNotNull(expectedWorkerName);
        assertNotNull(assignedWorker);
        assertEquals(expectedWorkerName, assignedWorker.getName());
    }

    @Then("^worker \"([^\"]*)\" should still be available$")
    public void worker_should_still_be_available(String expectedWorkerName) {
        assertNotNull(expectedWorkerName);
        Worker otherWorker = availableWorkers.peek();
        assertNotNull(otherWorker);
        assertEquals(expectedWorkerName, otherWorker.getName());
    }
    private static class Worker {
        private String name;
        private Orderr assignedOrder;

        public Worker(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void assignOrder(Orderr order) {
            assignedOrder = order;
        }

        public Orderr getAssignedOrder() {
            return assignedOrder;
        }
    }

    private static class Orderr {
        private String id;
        private String customerName;

        public Orderr(String id, String customerName) {
            this.id = id;
            this.customerName = customerName;
        }

        public String getId() {
            return id;
        }

        public String getCustomerName() {
            return customerName;
        }
    }
}
