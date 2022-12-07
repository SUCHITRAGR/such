package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/Feature"},
        glue = {"Mystepdef"},
        tags = "@Regression",
        plugin = {"pretty",
          "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})


public class Testrunner {

}