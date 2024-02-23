package cucumber_steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Simpleform_steps {
WebDriver driver;
@Given("User Opens the browser and navigate to v{int} training form website")
public void user_Opens_the_browser_and_navigate_to_v_training_form_website(Integer int1) throws InterruptedException {
    
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://v1.training-support.net/selenium/simple-form");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
   
}

@When("User Enters Firstname, Last name, Email")
public void user_Enters_Firstname_Last_name_Email() {
    
	driver.findElement(By.id("firstName")).sendKeys("Shaik");
	driver.findElement(By.id("lastName")).sendKeys("Rahamathulla");
    driver.findElement(By.id("email")).sendKeys("rahama123@gmail.com");
}

@When("Contact Number, Message")
public void contact_Number_Message() {
   
	driver.findElement(By.id("number")).sendKeys("9985384847");
	driver.findElement(By.xpath("//div[@class='field']//textarea")).sendKeys("Hello muskan");
   
}

@When("Users clicks on Submit")
public void users_clicks_on_Submit() {
   
	driver.findElement(By.xpath("//input[@value='submit']")).click();
    
}

@Then("A Confirmation popup is Displayed")
public void a_Confirmation_popup_is_Displayed() {
    // Write code here that turns the phrase above into concrete actions
	driver.quit();
	
   
}

}
