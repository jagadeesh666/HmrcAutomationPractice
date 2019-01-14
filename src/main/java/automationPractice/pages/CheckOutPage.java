package automationPractice.pages;

import automationPractice.Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckOutPage extends  BasePage {
    public Utils myUtility=new Utils();
    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = ".btn.btn-default.button.button-medium>span")
    private WebElement clickProceedToCheckoutButton;

    @FindBy(css = " .product-name>a")
    private List<WebElement> productLabelField;


    public void proceedToCheckout() {

        myUtility.sleep();
        clickProceedToCheckoutButton.click();

    }

    public boolean seeProductInMyCart(String text) {

        Boolean status=false;
        for (WebElement element : productLabelField)
        {


            if (element.getText().equalsIgnoreCase(text)) {
                status=true;

            }

        }
        return status;
    }
}