package project2023_test;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycleann.Admin;
import mycleann.Customers;
import mycleann.Product; 

public class AddCustomer {
	
	Admin admin;
	Customers customer;

	public AddCustomer(Customers customer)
	{
		this.admin =new Admin("abood","12345@abood");
		this.customer = customer;
	}
	
	
	@Given("Admin with name {string} and password {string} is logged in")
	public void admin_with_name_and_password_is_logged_in(String string, String string2) {
		admin.login("abood","12345@abood");

	}

	@Given("i will to add the customer")
	public void i_will_to_add_the_customer() {
		customer.putcustomer("12028255","ali","salfeet","0594348312");

	}

	@When("Admin click button add customers")
	public void admin_click_button_add_customers() {
		customer.addd(admin);

	}

	@Then("add done successfully")
	public void add_done_successfully() {
		 assertEquals(true,customer.addded());

	}

	@Given("the admin is not logged in")
	public void the_admin_is_not_logged_in() {
		   admin.logout();

	}
	
	@Given("i will to add a customer")
	public void i_will_to_add_a_customer() {
		customer.putcustomer("12028255","ali","salfeet","0594348312");

	}

	@When("click add customer")
	public void click_add_customer() {
		customer.addd(admin);

	}

	@Then("adding failed and print error message {string}")
	public void adding_failed_and_print_error_message(String string) {
		assertEquals(false,customer.addd(admin));
		System.out.println("please login to add customer");
	}

}
