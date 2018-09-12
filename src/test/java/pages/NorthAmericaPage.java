package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utitlities.Driver;

public class NorthAmericaPage {
	
	WebDriver driver;
	
	public NorthAmericaPage(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="United States of America")
	public WebElement USAlink;

}
