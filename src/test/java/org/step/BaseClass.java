package org.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public void getDriver(String browser) {
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		default:
			System.out.println("Invalid Browser Type");
			break;
		}
	}

	public void windowsMax() {
		driver.manage().window().maximize();
	}

	public void getUrl(String url) {
		driver.get(url);
	}

	public void textSendUsername(WebElement UserName, String keysToSend) {
		UserName.sendKeys(keysToSend);
	}

	public void textSendPassword(WebElement Password, String keysToSend) {
		Password.sendKeys(keysToSend);
	}

	public void loginButton(WebElement login) {
		login.click();
	}
	
	public void LocationDropdown(WebElement location, int Text) {
		Select s=new Select(location);
		s.selectByIndex(Text);
	}
	
	

}
