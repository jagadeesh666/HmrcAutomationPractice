package automationPractice.Utils;

import automationPractice.pages.BasePage;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserFactory extends  BasePage {
    public static void startBrowser()  {
        String path = System.getProperty("user.dir") + "/src/main/resources/";
        if (AutomationConstants.REMOTE_BROWSER == true) {
            System.out.println("Selenium Grid is running");

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setPlatform(Platform.MAC);
            caps.setBrowserName("chrome");
            caps.setVersion("");

       //     DesiredCapabilities caps = DesiredCapabilities.edge();
            caps.setCapability("platform", "macOS");
            caps.setCapability("version", "10.14");
            try {

                driver = new RemoteWebDriver(new URL(AutomationConstants.SELENIUM_GRID_URL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        } else {
            if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", path + "geckodriver");
                driver = new FirefoxDriver();
            } else if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", path + "chromedriver");
                driver = new ChromeDriver();
            } else if (AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver", path + "IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }
        }

        driver.get(AutomationConstants.baseURL);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

    }

    public static void stopBrowser() {
        if (driver != null) {
            driver.close();
          driver.quit();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {

            BrowserFactory.startBrowser();
        }
        return driver;
    }
}
