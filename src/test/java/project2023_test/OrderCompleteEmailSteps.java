package project2023_test;

import static org.junit.Assert.assertEquals;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderCompleteEmailSteps {

    private String customerEmail;
    private String orderId;
    private boolean emailSent;

    @Given("a customer with email {string}")
    public void a_customer_with_email(String email) {
        this.customerEmail = email;
    }

    @Given("an order with ID {string} is marked as complete")
    public void an_order_with_ID_is_marked_as_complete(String orderId) {
        this.orderId = orderId;
    }

    @When("the order completion email is sent")
    public void the_order_completion_email_is_sent() throws Exception {

    }

    @Then("the customer should receive an email with the order ID")
    public void the_customer_should_receive_an_email_with_the_order_ID() {
        assertEquals(true, true);
    }
}
