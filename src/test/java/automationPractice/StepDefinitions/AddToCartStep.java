package automationPractice.StepDefinitions;

import automationPractice.Utils.Utils;
import automationPractice.pages.HomePage;
import automationPractice.pages.ProductPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AddToCartStep {

    public HomePage homePage;
    public Utils myUtility;
    public ProductPage productPage;

    @Given("^I see search$")
    public void onSearchBox()
    {
        homePage=new HomePage();
        Assert.assertTrue(homePage.isSearchFieldDisplayed());
    }
    @And("^I type search item \"([^\"]*)\"$")
    public void enterSearchItem(String item)  {
        homePage.setSearchItem(item);

    }
    @And("^I select search$")
    public void submitSearchItem()
    {
        homePage.submitSearch();

    }

    @And("^I select a product\"([^\"]*)\"$")
    public void selectItemForCart(String product)  {
            productPage=new ProductPage();
             productPage.selectItem(product);
    }

    @Given("^I select most expensive dress \"([^\"]*)\"$")
    public void i_select_most_expensive_dress(String product) {
        productPage=new ProductPage();
        productPage.selectExpensiveItem(product);
        //*[@id="center_column"]/ul/li[4]/div/div[1]/div/div[2]/span
    }

    @When("^I select AddItemToCart$")
    public void selectAddItemToCart()
    {
        productPage.addItemToCart();

    }
    @Then("^I should see message \"([^\"]*)\"$")
    public void seeMessage(String Message) throws InterruptedException
    {
        Thread.sleep(2000L);
        Assert.assertTrue(productPage.itemInYourCartMessage(Message));

    }
}
