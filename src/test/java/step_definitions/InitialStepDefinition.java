package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InitialStepDefinition {

	@Given("^I have \\$(\\d+) in my accound$")
	public void i_have_$_in_my_accound(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I requested \\$(\\d+)$")
	public void i_requested_$(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^\\$(\\d+) should be dispensed$")
	public void $_should_be_dispensed(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
