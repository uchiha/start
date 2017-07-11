package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementation.Checkout;
import static org.testng.Assert.*;

public class CheckoutSteps {

	int bananaPrice = 0;
	int applePrice = 0;
	Checkout checkout = new Checkout();
	
	@Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
	public void thePriceOfAIsC(String name, int price) throws Throwable
	{
		if(name.startsWith("banana"))
		{
			bananaPrice = price;	
		}
		else
			applePrice = price;
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void iCheckout(int itemCount, String fruitName) throws Throwable 
	{
		if(fruitName.startsWith("banana"))
		{
			checkout.add(itemCount, bananaPrice, fruitName);
		}
		else
			checkout.add(itemCount, applePrice, fruitName);
	}

	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int total) throws Throwable 
	{
//		assert(total, checkout.total());
		assertEquals(checkout.total(), total);
	}
	
	@Before(order = 2)
	public void firstHook()
	{
		System.out.println("-->: from order 2 first hook");
	}
	
	@Before(order = 1)
	public void secondHook()
	{
		System.out.println("-->: from order 1 second hook");
	}
	
	@After(order = 2)
	public void firstAfterHook()
	{
		System.out.println("-->: from order 2 first after hook");
	}
	
	@After(order = 1)
	public void secondAfterHook()
	{
		System.out.println("-->: from order 1 second after hook");
	}

}
