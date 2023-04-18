package project2023_test;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mycleann.Admin;

public class AdminLogout {

	Admin admin;
	public AdminLogout ()
	{
		this.admin =new Admin("moheeb","123456");
	}
	@Given("the admin is loged in")
	public void the_admin_is_loged_in()
	{
		admin =new Admin("abood","12345@abood");	
	}
	
	@When("the admin is logs out")
	public void the_admin_is_logs_out()
	{
     admin.logout();
	}

	@Then("the admin is loged out")
	public void the_admin_is_loged_out()
	{
     admin.logout();
     assertEquals(false,admin.isLogged());
	}
}
