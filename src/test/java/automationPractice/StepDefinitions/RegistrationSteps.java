package automationPractice.StepDefinitions;

import automationPractice.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegistrationSteps {
    public LoginPage loginPage;
    public HomePage homePage;
    public MyAccountPage myAccountPage;
    public RegistrationPage registrationPage;

    @Then("^User should be on the regitration page$")
    public void verifyUserOnRegistrationPage()  {
        registrationPage=new RegistrationPage();
      Assert.assertTrue(registrationPage.isUserOnRegistrationPage());
    }

    @When("^I enters email as \"([^\"]*)\"$")
    public void enterUserEmaiId(String userid) {

        registrationPage.enterUserId(userid);

    }

    @And("^I select create account button$")
    public void clickOnCreateAnAccount() {
        registrationPage.clickCreateAnAccount();
    }

    @And("^I complete personnel information \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"$")
    public void enterPersonnelInformation(String title, String firstname, String surname, String passwd) {
        registrationPage.enterPersonnelInfo(title,firstname,surname,passwd);
    }

    @And("^I complete address details \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"$")
    public void enterAddressDetails(String address1, String city, String state, String postcode, String country, String mobile, String alias)
    {
        registrationPage.enterAddressInfo(address1,city,state,postcode,country,mobile,alias);

    }
    @And("^I select register$")
        public void clickOnRegister()
        {
          registrationPage.clickRegister();

        }

        @Then("^I should login and see message as \"([^\"]*)\"$")
        public void seeWelcomeLoginMessage (String message)
        {
           Assert.assertTrue(registrationPage.welcomeLoginMessage(message));

        }

        @Then("^I should see error message as \"([^\"]*)\"$")
        public void seeRegistrationErrorMessage (String message){


        Assert.assertTrue(registrationPage.registrationErrorMessage(message));
        }


    }

