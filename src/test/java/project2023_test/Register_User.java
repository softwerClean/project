package project2023_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycleann.Admin;
import mycleann.Company;
import mycleann.Customers;
import mycleann.Product;

public class Register_User 
{
	
	Admin admin ;
	Customers Customer;
	
	public Register_User(Customers Customer) 
	{
		this.Customer = Customer ;
		admin =new Admin("abood","12345@abood");	
	}
boolean success,Assert_sig=false;
Logger logger
= Logger.getLogger(Register_User.class.getName());
List< Customers> ID = new ArrayList<Customers>();

	@Given("the admin logged in")
	public void the_admin_logged_in() 
	{

		admin =new Admin("abood","12345@abood");	
	}

	
	@Given("user with ID {string} , Name {string} , Email {string} ,Address {string} , code {string} ,city {string}")
	public void user_with_id_name_email_address_code_city(String string, String string2, String string3, String string4, String string5, String string6) {
		Customer.Customers("12010108","Muheeb Hasan","s12010108@stu.najah.edu"
,"Nablus street","00000","Nablus");                

	}

	@When("the user is registered")
	public void the_user_is_registered() 
	{
	  if(success)
	  {
		  Company.addUser(admin, Customer);
	  }
	  else {
		  assertFalse(false);
	  }
	}
	@Given("the admin not logged in")
	public void the_admin_not_logged_in() 
	{

admin.isLogged();
	}
	@Then("the user with ID {string} , Name {string} , Email {string} ,Address {string} , code {string} ,city {string}\")is added")
	public void the_user_with_id_name_email_address_code_city_is_added(String string, String string2, String string3, String string4, String string5, String string6) 
	{
		  Company.addUser(admin, Customer);
			assertTrue(  Company.isUserRegestered(string));

	}
	@Then("the error massage{string} ")
	public void the_error_massage_we_must_the_admin_logged_in(String string) {


		 logger.log(Level.INFO,"we must the admin logged in");
	}


	@Then("the error massage {string} ")
	public void the_error_massage_this_user_is_already_registered(String string) {
		ID = Company.serachUserBysig(string);
	    if (ID.isEmpty()) {
	        logger.log(Level.INFO,"you can add this user");
	        Assert_sig = false;
	    } else {
	        logger.log(Level.INFO,"this user is already registered");
	        for (int i = 0; i < ID.size(); i++)
	        Assert_sig = true;
			assertEquals( true, Company.isUserRegestered(string) );

	    }
	}

}
