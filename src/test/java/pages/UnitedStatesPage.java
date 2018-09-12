package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utitlities.Driver;

public class UnitedStatesPage {
	
	WebDriver driver;
	
	public UnitedStatesPage(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="District of Columbia")
	public WebElement DColumbiaLink;

}
