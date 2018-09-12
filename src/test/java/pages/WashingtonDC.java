package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utitlities.Driver;

public class WashingtonDC {
	
	WebDriver driver;
	
	public WashingtonDC(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public static boolean checkIfFahren(String string) {
		
		String str =  Driver.getDriver().findElement(By.xpath(string)).getText();
		if(str.contains("°F")) {
		return true;
		}
		return false;
	}
    
	
	@FindBy(linkText="Daily Averages")
	public WebElement dailyAverages;
	
	
	@FindBy(xpath ="(//td[@class='day'])[1]")
	public WebElement date;



}

