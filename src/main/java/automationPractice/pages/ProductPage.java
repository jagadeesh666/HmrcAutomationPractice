package automationPractice.pages;

import automationPractice.Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends  BasePage {


    public Utils myUtility=new Utils();
    public Object selectExpensiveItem;

    public ProductPage(){

        PageFactory.initElements(driver, this);
    }

    // select item block //*[@id="center_column"]/ul/li[5]/div/div[2]/div[2]/a[1]/span
    @FindBy(xpath=".//*[@id='center_column']/ul/li/div/div[2]")
   private WebElement addProductToCartField;

    @FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a")
    //@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/div[2]/span")
    private WebElement addExpensiveProductToCartField;


   @FindBy(css=" .button.ajax_add_to_cart_button.btn.btn-default>span")
    private WebElement clickAddToCartField;
//layer cart display
    @FindBy(xpath=".//*[@id='layer_cart']/div[1]/div[1]/h2")
    private WebElement layerCartField;

    @FindBy(xpath = ".//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/div[2]/span")
    private WebElement expensive;

    public void selectItem(String text)
    {

    if(addProductToCartField.getText().contains(text))
    {

    myUtility.moveTo(addProductToCartField);
    }
    }

    public void selectExpensiveItem(String text)
    {

        if(addExpensiveProductToCartField.getText().contains(text))
        {

            myUtility.moveTo(addProductToCartField);
        }

        // List<WebElement> ListOfElements = (List<WebElement>) driver.findElements(By.xpath("//*[@id=\\\"center_column\\\"]/ul/li[4]/div/div[1]/div/div[2]/span"));
        //List<WebElement> ListOfElements = (List<WebElement>) driver.findElements(By.className("price product-price"));


         //expensive   = driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/div[2]/span").findElements(By.ByLinkText));

//        if(addProductToCartField.getText().contains(text))
//        {
//
//            myUtility.moveTo(addProductToCartField);
//        }
    }
    public void addItemToCart()

    {
       clickAddToCartField.click();
    }
    public boolean itemInYourCartMessage(String text)
{
    return (layerCartField.getText().contains(text));
}
}

