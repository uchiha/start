package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InitialStepDefinition {

	@Given("I have \\$(\\d+) in my account")
	public void iHave$InMyAccound(int amount) throws Throwable {
		System.out.println(">>> \"Amount captured: " + amount + "\"");
		new Account(amount);
	}

	@When("^I requested \\$(\\d+)$")
	public void iRequested$(int arg1) throws Throwable {
		throw new PendingException();
	}

	@Then("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(int arg1) throws Throwable {
		throw new PendingException();
	}
	
	class Account{
		public Account(int openingBalance)
		{
			
		}
	}
}




