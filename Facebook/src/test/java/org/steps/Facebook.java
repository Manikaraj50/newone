package org.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
      WebDriver driver;
@Given(": User the navigates to the facenbook url")
public void user_the_navigates_to_the_facenbook_url() {
    WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
}

@When(": User enters the username and password")
public void user_enters_the_username_and_password() {
	WebElement findElement = driver.findElement(By.id("email"));
	findElement.sendKeys("mankaraj1999@gmail.com");
	WebElement findElement2 = driver.findElement(By.name("pass"));
	findElement2.sendKeys("1234568");
}

@When(": User the click the login button")
public void user_the_click_the_login_button() {
	WebElement findElement3 = driver.findElement(By.name("login"));
	findElement3.click();
}

@Then(": user the validates and close the browser")
public void user_the_validates_and_close_the_browser() throws InterruptedException {
   Thread.sleep(10000);
   driver.close();

}


}
