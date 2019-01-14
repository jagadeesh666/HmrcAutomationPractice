package automationPractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    @FindBy(id = "search_query_top")
    private WebElement searchBoxTextField;

    @FindBy(css = ".btn.btn-default.button-search")
    private WebElement submitSearchField;

    @FindBy(css = ".login")
    private WebElement signInLink;


    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    public void goToSignInPage() {
        signInLink.click();
    }

    public boolean isSearchFieldDisplayed() {
        return (searchBoxTextField.isDisplayed());
    }

    public void setSearchItem(String text) {
        searchBoxTextField.sendKeys(text);

    }

    public void submitSearch() {
        submitSearchField.click();
    }

}
