package org.step;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExecutionClass extends BaseClass {
	public static BaseClass b = new BaseClass();
	public static PomClass pom;


	@Given("User should be in Login page")
	public void TC01() {
		try {
			b.getDriver("Chrome");
			b.windowsMax();
			System.out.println("Browser launched successfully");
		} catch (Exception e) {
			System.out.println("Browser not launched successfully");
		}

		try {
			b.getUrl("https://adactinhotelapp.com/");
			System.out.println("URL launched successfully");
		} catch (Exception e) {
			System.out.println("URL not launched successfully");
		}
	}


	@When("User should enter the Username and Password")
	public void TC02() {
		try {
			 pom = new PomClass();
			 
			WebElement UserName = pom.getUserName();
			UserName.sendKeys("divyajayakumar020992");

			WebElement Password = pom.getPassword();
			Password.sendKeys("1234divya");
			
			System.out.println("Login Datas entered successfully");
			
		} catch (Exception e) {
			System.out.println("Login Datas not entered successfully");
		}
	}


	@When("User should click the login button")
	public void TC03() {
		try {
			pom = new PomClass();
			WebElement Login = pom.getLogin();
			Login.click();
			System.out.println("Login button clicked successfully");
		} catch (Exception e) {
			System.out.println("Login button not clicked successfully");
		}
	}

	@Then("User should verify the login success message")
	public void TC04() {
		System.out.println("Verify the login success Message");
	}
	
	@Given("User should be able to Login Search page")
	public void TC05() {
	
	}
	
	@When("User should select location,hotels,room type,No of rooms, check-in date,Check-out date, adults room and children room")
	public void TC06() {
	    
	}
	
	@When("User should able to click the search button and reset button")
	public void TC07() {	    
	}
	
	@Then("verify whether user should be able to see the list of hotels")
	public void TC08() {
	   
	}

}
