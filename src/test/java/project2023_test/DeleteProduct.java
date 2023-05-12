package project2023_test;

import static org.junit.Assert.assertEquals;

import java.util.logging.Level;
import java.util.logging.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycleann.Admin;
import mycleann.FirstClass;
import mycleann.Product;

public class DeleteProduct
{
	static Logger logger = Logger.getLogger(FirstClass.class.getName());

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

@Given("the name is {string},the Category is {string},the price is {string},the amount is {string},the orderID is {string}")
public void the_name_is_the_category_is_the_price_is_the_amount_is_the_orderID_is(String string, String string2, String string3, String string4,String string5) {
	product.product("Category", "name", "price", "12", "101520");
    
}

@When("the product is deleted from the menue")
public void the_product_is_deleted_from_the_menue() {
	product.delete(admin);
}

@Then("the product with name is {string},the Category is {string},the price is {string},the amount is {string},the orderID is {string} is deleted from menue")
public void the_product_with_name_is_the_category_is_the_price_is_the_amount_is__the_orderID_is_is_deleted_from_menue(String string, String string2, String string3, String string4,String string5) {
	assertEquals(true,product.delete());
}

@Given("the admin is not login")
public void the_admin_is_not_login() {
    admin.logout();
}

@When("the product is not Deleted from the menue")
public void the_product_is_not_deleted_from_the_menue() {
  
}

@Then("print {string}")
public void print(String string) {
	 assertEquals(false,product.delete(admin));
	 logger.log(Level.INFO,"can not add becouse the admin is not login");
}
}