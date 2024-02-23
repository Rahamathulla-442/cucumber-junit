package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)   // runwith is used when we have to run specific file

@CucumberOptions(features= {"C:\\SpringTool\\cucumber_practice\\src\\test\\resources\\form\\simpleform.feature"},
glue={"cucumber_steps"}
)


public class login_runner {

}
