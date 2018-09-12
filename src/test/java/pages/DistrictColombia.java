package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utitlities.Driver;

public class DistrictColombia {
	
	WebDriver driver;
	
	public DistrictColombia(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Washington")
	public WebElement DCwash;

}