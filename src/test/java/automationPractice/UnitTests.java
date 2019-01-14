package automationPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import automationPractice.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class UnitTests
{

    public static void main (String[] args) {
       // System.setProperty("webdriver.gecko.driver", "/Users/jagadeeshm/Desktop/frameworks/JavaUI/QAMastersHybrid1/src/main/resources/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/jagadeeshm/Desktop/frameworks/JavaUI/QAMastersHybrid1/src/main/resources/chromedriver");
       // WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com");
    }




}
