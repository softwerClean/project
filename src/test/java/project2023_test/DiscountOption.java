package project2023_test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycleann.FirstClass;


public class DiscountOption {
	static Logger logger = Logger.getLogger(FirstClass.class.getName());

    ArrayList<String> name , totalpayed , frequently;
    boolean flag = false;
	private String CustomerName;
	int i;
	double discount;
	double total;
	
	
	@Given("these customers and those information")
	public void these_customers_and_those_information(io.cucumber.datatable.DataTable dataTable) {
	   
		name = new ArrayList<String>();
		totalpayed = new ArrayList<String>();
		frequently = new ArrayList<String>();
		name.addAll(dataTable.column(0));
		totalpayed.addAll(dataTable.column(1));
		frequently.addAll(dataTable.column(2));

	}

	@Given("the {string} has used the service {string}")
	public void the_has_used_the_service(String string, String string2) {

		CustomerName = string;
		for(String findName : name)
		   {
			   if(findName.equalsIgnoreCase(CustomerName))
			   {
				   i = name.indexOf(CustomerName);
			   }
		   }
		
		if( Integer.parseInt(frequently.get(i)) > 10)
		   {
			   flag = true;
		   }
		else flag = false;
	}

	@Given("he has spent more than {int} NIS")
	public void he_has_spent_more_than_nis(Integer int1) {

		
	   
	   if(Integer.parseInt(totalpayed.get(i))> int1 && flag == true)
	   {
		   flag = true;
	   }
	   else flag = false;
		
	}

	@When("he requests a discount")
	public void he_requests_a_discount() {

		if(flag == true)
		{
			discount = Double.parseDouble(totalpayed.get(i))*0.1;
			total = Double.parseDouble(totalpayed.get(i)) - discount;
			
		}

		
	}

	@Then("the discount rate should be {int} %")
	public void the_discount_rate_should_be(Integer int1) {
	  assertEquals(true, flag);
	  logger.log(Level.INFO,"You get 10% discount, you will pay "+total);
	}

	@When("the {string} hasnt used the service so many")
	public void the_hasnt_used_the_service_so_many(String string) {

		CustomerName = string;
		
		for(String findName : name)
		   {
			   if(findName.equalsIgnoreCase(CustomerName))
			   {
				   i = name.indexOf(CustomerName);
			   }
		   }
		
		if( Integer.parseInt(frequently.get(i)) < 10)
		   {
			   flag = false;
		   }
		else flag = true;
		
		total =  Double.parseDouble(totalpayed.get(i));

	}

	@When("the customer hasnt spent more than {int} NIS")
	public void the_customer_hasnt_spent_more_than_nis(Integer int1) {
		
		if( Integer.parseInt(totalpayed.get(i)) < int1)
		   {
			   flag = false;
		   }
		
		else if(flag == true) 
			flag = true;
		
		else flag = false;

		
	}

	@Then("he will not get a discount")
	public void he_will_not_get_a_discount() {
		 assertEquals(false, flag);
		 logger.log(Level.INFO,"you will pay "+total);
	}
}