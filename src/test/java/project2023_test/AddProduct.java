package project2023_test;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;
import java.util.logging.Level;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycleann.Admin;
import mycleann.FirstClass;
import mycleann.Product;

public class AddProduct
{
	static Logger logger = Logger.getLogger(FirstClass.class.getName());

	Admin admin;
	Product product;
	public AddProduct(Product product)
	{
		this.admin =new Admin("abood","12345@abood");
		this.product = product;
	}
	

@Given("the admin is log")
public void the_admin_is_log() {
	admin.login("abood","12345@abood");
}

@Given("i wont to add the product")
public void i_wont_to_add_the_product() {
	product.putProduct("rug","Cotton","100","3","101520");
    
}

@When("add product")
public void add_product() {
	product.add(admin);
  
}

@Then("add done")
public void add_done() {
	 assertEquals(true,product.added());

}

@Given("the admin is not log")
public void the_admin_is_not_log() {
   admin.logout();
}

@Then("error message {string}")
public void error_message(String string) {
	assertEquals(false,product.add(admin));
	logger.log(Level.INFO,"can not add becouse the admin is not login");
   
}
}