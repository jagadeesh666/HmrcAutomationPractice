package automationPractice.StepDefinitions;

import automationPractice.Utils.BrowserFactory;
import automationPractice.pages.BasePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends  BasePage {
    Scenario scenario;
    @Before
    public void setUp(Scenario scenario){
       BrowserFactory.startBrowser();
       maximiseBrowser();
//        this.scenario=scenario;
//        System.out.println("Executing scenario "+ scenario.getName());
    }

    @After
    public void cleanUp(){
//        scenario.write("finished scenario");
//        if(scenario.isFailed()) {
//            scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES),"image/png");
//        }
        driver.close();
        driver.quit();
        }
}
