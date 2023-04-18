package project2023_test;

import mycleann.Admin;
import mycleann.Company;
import mycleann.Customers;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class NotifyUser
{

	Customers Customer;
	Company comp;
	Admin admin ;
 Emailmockholder email;
	
 
 
 public NotifyUser(Emailmockholder email)
 {
	 
	 this.email=email;
 }
 
	
@Given("the order is complete")
public void the_order_is_complete() throws IOException
{
	 Company.remender(Customer);

}

@When("the admin send email remender")
public void the_admin_send_email_remender() throws IOException
{
 Company.remender(Customer);
}

@Then("the customer should receive email {string} and {string}")
public void the_customer_should_receive_email_and(String string,String string2)throws IOException
{
	verify(email.getMockEmailHolder()).sendEmail(Customer.GetEmail(),string,string2);

}
	
	
}
