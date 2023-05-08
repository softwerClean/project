package project2023_test;
import static org.junit.Assert.assertEquals;

import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycleann.Admin;
import mycleann.Customers;
import mycleann.FirstClass;
public class DeleteCustomer {

	static Logger logger = Logger.getLogger(FirstClass.class.getName());

	Admin admin;
	Customers customer;
	public DeleteCustomer(Customers customer) 
	{
		this.customer = customer ;
		this.admin = new Admin("CR7","1202568");
	}


	
	
	@Given("the admin is loggin")
	public void the_admin_is_loggin() {
		 admin.login("CR7", "1202568");

	}

	@Given("the id is {string},the name is {string},the address is {string},the phone is {string}")
	public void the_id_is_the_name_is_the_address_is_the_phone_is(String string, String string2, String string3, String string4) {
	//	customer.customer("id", "name", "address", "phone");

	}

	@When("the job of the customer is canceled")
	public void the_job_of_the_customer_is_canceled() {
		customer.delete(admin);

	}

	@Then("the customer with id is {string},the name is {string},the address is {string},the phone is {string} is deleted from menue")
	public void the_customer_with_id_is_the_name_is_the_address_is_the_phone_is_is_deleted_from_menue(String string, String string2, String string3, String string4) {
		assertEquals(true,customer.delete(admin));

	}

	@Given("the admin is logged out")
	public void the_admin_is_logged_out() {
	    admin.logout();

	}

	@Given("the customer id is {string},the name is {string},the address is {string},the phone is {string}")
	public void the_customer_id_is_the_name_is_the_address_is_the_phone_is(String string, String string2, String string3, String string4) {
	
	}

	@When("the job of the customer is not canceled")
	public void the_job_of_the_customer_is__not_canceled() {
	  
	}

	@Then("print message {string}")
	public void print_message(String string) {
		 assertEquals(false,customer.delete(admin));
		 logger.log(Level.INFO,"can not Delete becouse the admin is not login");
	}
}
