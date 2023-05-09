package project2023_test;

import mycleann.Admin;

import static org.junit.Assert.assertEquals;

import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycleann.Customers;
import mycleann.FirstClass;

public class UpdateCustomer {
	static Logger logger = Logger.getLogger(FirstClass.class.getName());

	Admin admin;
	Customers customer;
	public UpdateCustomer(Customers ustomer)
	{
		this.admin =new Admin("abood","12345@abood");
		this.customer = ustomer;
	}
	
	
	
	@Given("admin is logge in")
	public void admin_is_logge_in() {
		admin.login("abood","12345@abood");

	}

	@Given("customer id is {string},the name is {string},the address is {string},the phone is {string}")
	public void customer_id_is_the_name_is_the_address_is_the_phone_is(String string, String string2, String string3, String string4) {
	  
	}

	@When("click update the informations")
	public void click_update_the_informations() {
		customer.updateMissing(admin);
	}

	@Then("customer update to the id  {string},the name is {string},the price is {string},the amount is {string}")
	public void customer_update_to_the_id_the_name_is_the_price_is_the_amount_is(String string, String string2, String string3, String string4) {
		assertEquals(true,customer.update());
	}

	@Given("the admin is not log in")
	public void the_admin_is_not_log_in() {
		admin.logout();
	}

	@When("click update to the customer")
	public void click_update_to_the_customer() {
	   
	}

	@Then("error message and printed {string}")
	public void error_message_and_printed(String string) {
		assertEquals(false,customer.updateCustomer(admin));
		logger.log(Level.INFO,"can not update up becouse  the admin is not login");
	}

	@Given("admin  logged in")
	public void admin_logged_in() {
		admin.login("abood","12345@abood");

	}

	@Given("the Customer id is {string},the name is {string}")
	public void the_customer_id_is_the_name_is(String string, String string2) {
	   
	}

	@When("click Update of the customer")
	public void click_update_of_the_customer() {
		admin.updatingUp();
	}

	@Then("Customer are update to the id is {string},the name is {string}")
	public void customer_are_update_to_the_id_is_the_name_is(String string, String string2) {

	}
}
