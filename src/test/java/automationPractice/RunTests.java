package automationPractice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/automationPractice/features/",
      //  tags = {"@validLogin"},
        plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true)

//         tags={"@smoke"},
//        tags = {"@checkout"},
//        dryRun = false,
//        monochrome = false,
//        strict = true,
//        snippets = SnippetType.CAMELCASE,
//        plugin = {"junit:target/junit-reports","testng:target/testng-reports","json:target/json", "html:target/selenium-reports"})

public class RunTests {

}
