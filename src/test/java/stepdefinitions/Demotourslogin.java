
package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
//import org.junit.Assert.assertTrue;


public class Demotourslogin {

  WebDriver driver = null ;




    @Given("^I navigate to newtoursdemo$")
    public void i_navigate_to_newtoursdemo() throws Throwable {

        driver = new ChromeDriver();

        driver.navigate().to(" http://newtours.demoaut.com/");
        driver.findElement(By.className("mouseOver")).click();


    }

    @When("^I enter Username and Password$")
    private void i_enter_Username_and_Password(String username ,String password ) throws Throwable {

        driver.findElement(By.name("userName")).sendKeys("rsayana");
        driver.findElement(By.name("password")).sendKeys("smile");
        driver.findElement(By.name("login")).click();


    }

//    @Then("^I should be in the Sign on screen$")
//    public void i_should_be_in_the_Sign_on_screen() throws Throwable {
//
//        assertTrue("In Sign on page" ,driver.getTitle().equals("Sign on confirmation"));
//
//
//
//    }

}
