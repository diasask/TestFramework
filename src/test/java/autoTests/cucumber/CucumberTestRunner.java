package autoTests.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = "pretty",
        monochrome = true,
        tags = "@smoke",
        glue = "autoTest.cucumber",
        features = "classpath:cucumber/testNG/features"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
