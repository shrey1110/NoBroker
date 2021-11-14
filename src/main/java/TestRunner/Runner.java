package TestRunner;

import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.SQLException;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:\\HealthGraph\\src\\main\\java\\features", //the path of the feature files
        glue={"StepDefinitions"} //the path of the step definition files
        //format= {"pretty","html:test-outout“}
)

public class Runner {

}
