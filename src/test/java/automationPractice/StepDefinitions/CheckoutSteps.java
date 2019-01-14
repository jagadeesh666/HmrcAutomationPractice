package automationPractice.StepDefinitions;

import automationPractice.pages.CheckOutPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CheckoutSteps {
    public CheckOutPage checkout;

    @When("^I proceed to checkout$")
    public void proceedToCheckout()
    {
        checkout=new CheckOutPage();
        checkout.proceedToCheckout();
    }

    @Then("^I should see \"([^\"]*)\" in my Cart$")
    public void seeProductInMyCart(String expectedProduct)
    {
        Assert.assertTrue(checkout.seeProductInMyCart(expectedProduct));

    }
}
