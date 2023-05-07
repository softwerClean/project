package project2023_test;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GenerateStatistics {

    private int deliveredItems;
    private int receivedCash;
    private int receivedPayment;
    private int unpaidDebts;

    @Given("I have delivered {int} items")
    public void i_have_delivered_items(Integer deliveredItems) {
        this.deliveredItems = deliveredItems;
    }

    @When("I generate a report")
    public void i_generate_a_report() {
    }

    @Then("the total delivered items should be {int}")
    public void the_total_delivered_items_should_be(Integer expectedDeliveredItems) {
        assertEquals(expectedDeliveredItems.intValue(), deliveredItems);
    }

    @Given("I have received {int} NIS in cash")
    public void i_have_received_nis_in_cash(Integer receivedCash) {
        this.receivedCash = receivedCash;
    }

    @When("Im generate a report")
    public void im_generate_a_report() {
    }

    @Then("the total cash should be {int} NIS")
    public void the_total_cash_should_be_nis(Integer expectedCash) {
        assertEquals(expectedCash.intValue(), receivedCash);
    }

    @Given("I have received {int} NIS in payment")
    public void i_have_received_nis_in_payment(Integer receivedPayment) {
        this.receivedPayment = receivedPayment;
    }

    @When("I will generate a report")
    public void i_will_generate_a_report() {
    }

    @Then("the total paid should be {int} NIS")
    public void the_total_paid_should_be_nis(Integer expectedPayment) {
        assertEquals(expectedPayment.intValue(), receivedPayment);
    }

    @Given("I have unpaid debts of {int} NIS")
    public void i_have_unpaid_debts_of_nis(Integer unpaidDebts) {
        this.unpaidDebts = unpaidDebts;
    }

    @When("we generate a report")
    public void we_generate_a_report() {
    }

    @Then("the total debts should be {int} NIS")
    public void the_total_debts_should_be_nis(Integer expectedDebts) {
        assertEquals(expectedDebts.intValue(), unpaidDebts);
    }
}
