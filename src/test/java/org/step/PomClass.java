package org.step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PomClass extends BaseClass{
     public PomClass(){
    	 PageFactory.initElements(driver,this);
     }
   @CacheLookup  
     @FindBy(how=How.ID,using="username")
     private WebElement UserName;
     WebElement getUserName() {
    	 return UserName;
     }
     
     @FindBy(how=How.ID,using="password")
     private WebElement Password;
     WebElement getPassword() {
    	 return Password;
     }
	
     @FindBy(how=How.ID,using="login")
     private WebElement Login;
     WebElement getLogin() {
    	 return Login;
     }

}
