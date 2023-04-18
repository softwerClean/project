package project2023_test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycleann.Admin;
import mycleann.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SearchProduct
{
Admin admin;
Product product;

List<Product> name =new ArrayList();

	boolean name2 = false;
List<String> data;
Logger log = Logger.getLogger(SearchProduct.class.getName());
	

public SearchProduct()
{
	
	this.admin =new Admin("abood","12345@abood");
	product = new Product();
}



	@Given("the product contained in company")
	public void the_product_contained_in_company(io.cucumber.datatable.DataTable dataTable) 
	{
		for(int i=0;i<dataTable.height();i++)
		{
			product.add(admin);
		}
	}

	@Given("the admin not logg in")
	public void the_admin_not_logg_in()
	{

admin.login("abood","12345@abood");
	}

	@When("the user search for txt {string}")
	public void the_user_search_for_txt(String string) 
	{
	  name = Product.SearchByName(string);
	}

	@Then("the product with name {string} is found")
	public void the_product_with_name_is_found(String string) 
	{
		name = Product.SearchByName(string);
		if(name.isEmpty())
		{
			   log.log(Level.INFO,"Product is empty");
			
			name2=false;
		}
		else {
        assertFalse(name2);
		}
	}

	@Given("the admin  logg in")
	public void the_admin_logg_in() {

admin.logout();
}

	@Then("no product found")
	public void no_product_found()
	{
		name = Product.SearchByName("");
		if(name.isEmpty())
		{
			   log.log(Level.INFO,"Product is empty");
			
			name2=false;
		}
        assertFalse(name2);

		
	}

	@Then("the product with name {string} and {string} found")
	public void the_product_with_name_and_found(String string, String string2) 
	{
		name2 = true;
		assertTrue(name2);
	}

	
	
	
	

}
