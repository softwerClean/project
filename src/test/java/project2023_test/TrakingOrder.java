package project2023_test;


import java.util.logging.Logger;
import java.util.logging.Level;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycleann.FirstClass;

public class TrakingOrder {
	static Logger logger = Logger.getLogger(FirstClass.class.getName());

	String CustomerName;
	int ordernum;
	String Status;
	@Given("{string} have an order with the order number {int}")
	public void have_an_order_with_the_order_number(String string, Integer int1) {

		this.CustomerName = string;
        this.ordernum = int1;
	}

	@When("he check the status of his order")
	public void he_check_the_status_of_his_order() {


		Status = "waiting";

	}

	@Then("the status should be {string}")
	public void the_status_should_be(String expectedStatus) {
		 if (Status.equals(expectedStatus)) {
			 logger.log(Level.INFO,CustomerName + ", your order with number " + ordernum + " is " + Status + "!");
	        } else {
	        	logger.log(Level.INFO,"Expected status: " + expectedStatus + ", but actual status is: " + Status);
	        }

	}

	@When("the order is being processed")
	public void the_order_is_being_processed() {


		Status = "in treatment";
		
	}

	@When("the order is complete")
	public void the_order_is_complete() {

		Status = "complete";
		
	}
	
	
	
	
}
