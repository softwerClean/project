package project2023_test;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycleann.Admin;
import mycleann.Product;

public class DeleteProduct
{
	
	Admin admin;
	Product product;
	public DeleteProduct(Product product) 
	{
		this.product = product ;
		this.admin = new Admin("CR7","1202568");
	}




@Given("the admin is logged in")
public void the_admin_is_logged_in() {
	 admin.login("CR7", "1202568");
}

@Given("the name is {string},the Category is {string},the price is {string},the amount is {string}")
public void the_name_is_the_category_is_the_price_is_the_amount_is(String string, String string2, String string3, String string4) {
	product.Product("Category", "name", "price", "12");
    
}

@When("the product is deleted from the menue")
public void the_product_is_deleted_from_the_menue() {
	product.delete(admin);
}

@Then("the product with name is {string},the Category is {string},the price is {string},the amount is {string} is deleted from menue")
public void the_product_with_name_is_the_category_is_the_price_is_the_amount_is_is_deleted_from_menue(String string, String string2, String string3, String string4) {
	assertEquals(true,product.delete());
}

@Given("the admin is not login")
public void the_admin_is_not_login() {
    // Write code here that turns the phrase above into concrete actions
    admin.logout();
}

@When("the product is not Deleted from the menue")
public void the_product_is_not_deleted_from_the_menue() {
    // Write code here that turns the phrase above into concrete actions
  
}

@Then("print {string}")
public void print(String string) {
    // Write code here that turns the phrase above into concrete actions
	 assertEquals(false,product.delete(admin));
		System.out.println("can not add becouse the admin is not login");
}
}
