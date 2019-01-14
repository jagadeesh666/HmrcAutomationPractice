package automationPractice.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Utils extends BrowserFactory{

    //public static Utils myUtility=new Utils();

    WebDriverWait wait = new WebDriverWait(driver,AutomationConstants.TIMEOUT);

    public void waitForElementClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public static void moveTo(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    public static void mouseHoverAndClick(WebElement elementToHover, WebElement elementToClick) {
        Actions action = new Actions(driver);
        action.moveToElement(elementToHover).click(elementToClick).build().perform();
    }

    public static void selectFromList(WebElement element, String text)
    {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for(WebElement we:options)
        {
            if (we.getText().equals(text))
            {
                select.selectByVisibleText(text);
            }
        }

    }

    public void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
