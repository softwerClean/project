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

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Rrport 
{

Admin admin;
Customers cus;
List<Map<String, String>> custmer;
List<Map<String, String>> list;

public void Rrport()
{
	
	admin=new Admin("adham_12028277","123456789@adham");
	}


	@Given("admin logged in")
	public void admin_logged_in() 
	{
		admin=new Admin("adham_12028277","123456789@adham");	
		}

	@When("admin enters customer")
	public void admin_enters_customer(io.cucumber.datatable.DataTable dataTable) 
	{
		   List<Map<String, String>> customer =dataTable.asMaps(String.class, String.class);
		   
		   custmer  =customer;
		   
		   for(Map<String, String> ad:custmer) 
		   {
			 System.out.println("-----------------------------------------------------");
		     
			 System.out.println(ad.get("name"));  
			 System.out.println(ad.get("user_name"));  
			 System.out.println(ad.get("phone_number"));  
			 System.out.println(ad.get("city"));
			 System.out.println("------------------------------------------------------");
			   
		   }
		   
		   
	}

	@Then("print data of customer")
	public void print_data_of_customer() {
	   
	}

	@When("admin enters product")
	public void admin_enters_product(io.cucumber.datatable.DataTable dataTable)
	{
   List<Map<String, String>> customer =dataTable.asMaps(String.class, String.class);
		   
		   list  =customer;
		   
		   for(Map<String, String> ad: list) 
		   {
			 System.out.println("-----------------------------------------------------");
		     
			 System.out.println(ad.get("Category"));  
			 System.out.println(ad.get("name"));  
			 System.out.println(ad.get("price"));  
			 System.out.println(ad.get("amount"));
			 System.out.println("------------------------------------------------------");
			   
		   }
	}

	@Then("print data of product")
	public void print_data_of_product() 
	{
	    
	}

}
