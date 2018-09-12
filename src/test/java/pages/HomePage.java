package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utitlities.Driver;

public class HomePage {
	WebDriver driver;
	
	public HomePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[contains(@src,'/gr/f-head-blue.png')]")
	public WebElement FanhButton;
	
	@FindBy(linkText="North America")
	public WebElement NAButton;
	
	
}
