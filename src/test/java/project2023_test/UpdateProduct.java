package project2023_test;

import static org.junit.Assert.assertEquals;

import java.util.logging.Level;
import java.util.logging.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycleann.Admin;
import mycleann.Product;

public class UpdateProduct
{
	static Logger logger = Logger.getLogger(UpdateProduct.class.getName());

	Admin admin;
	Product product;
	public UpdateProduct(Product product)
	{
		this.admin =new Admin("abood","12345@abood");
		this.product = product;
	}
	
	@Given("admin is login")
	public void admin_is_login() {
		admin.login("abood","12345@abood");

	}

	@Given("the product name is {string},the Category is {string},the price is {string},the amount is {string},the orderID is {string}")
	public void the_product_name_is_the_category_is_the_price_is_the_amount_is_the_orderID_is(String string, String string2, String string3, String string4,String string5) {
		product.processProduct("Category", "name", "price", "12", "101520");
	}

	@When("the product is Update missing from the menu")
	public void the_product_is_Update_missing_from_the_menu() {
		product.updateMissing(admin);

	}

	@Then("the product update to the product name is {string},the Category is {string},the price is {string},the amount is {string},the orderID is {string}")
	public void the_product_update_to_the_product_name_the_category_is_the_price_is_the_amount_is_the_orderID_is(String string, String string2, String string3, String string4,String string5) {
		assertEquals(true,product.update());

	}
	@Given("the admin is not login ")
	public void the_admin_is_not_login () {
		admin.logout();
	}
	@Then("error message was printed {string}")
	public void error_message_was_printed(String string) {
	    admin.logout();
		assertEquals(false,product.updateMissing(admin));
		logger.log(Level.INFO,"can not update missing becouse the admin is not login");
	}
	
	
	@When("the product is Update up from the menu")
	public void the_product_is_Update_up_from_the_menu() {
	    admin.updatingUp();
	}

	@Then("print error message {string}")
	public void print_error_message(String string) {
	    admin.logout();

		assertEquals(false,product.updateUp(admin));
		logger.log(Level.INFO,"can not update up becouse  the admin is not login");
	}
}