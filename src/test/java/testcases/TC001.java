package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DistrictColombia;
import pages.HomePage;
import pages.NorthAmericaPage;
import pages.UnitedStatesPage;
import pages.WashingtonDC;
import utitlities.ConfigurationReader;
import utitlities.Driver;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class TC001 {

//	@Test(priority = 1)
//
//	public void test11() throws InterruptedException {
//		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//		Assert.assertEquals(Driver.getDriver().getTitle(), ConfigurationReader.getProperty("title"));
//
//		HomePage hm = new HomePage();
//
//		String path = hm.FanhButton.getAttribute("src");
//		Assert.assertTrue(path.contains("blue"));
//		
//		hm.NAButton.click();
//
//		NorthAmericaPage na = new NorthAmericaPage();
//		Assert.assertEquals(Driver.getDriver().getTitle(), ConfigurationReader.getProperty("NorthAmericaTitle"));
//		
//		na.USAlink.click();
//		
//		UnitedStatesPage usa = new UnitedStatesPage();
//		Driver.getDriver().manage().window().fullscreen();
//		Assert.assertEquals(Driver.getDriver().getTitle(),ConfigurationReader.getProperty("UnitedStatesTitle"));
//
//		usa.DColumbiaLink.click();
//		
//		DistrictColombia dc = new DistrictColombia();
//
//		dc.DCwash.click();
//		Assert.assertEquals(Driver.getDriver().getTitle(),ConfigurationReader.getProperty("WashingtonTitle"));
//
//	    WashingtonDC wdc = new WashingtonDC();
//
//	    wdc.dailyAverages.click();
//
//	String str = Driver.getDriver().getTitle();
//
//	Assert.assertTrue(str.contains("Washington, District of Columbia - March"));
//
//	 
//
//	wdc.date.click();
//
//	Thread.sleep(2000);
//
//	String result = Driver.getDriver().findElement(By.xpath("(//div[@id='headerfont'])[5]")).getText();
//
//	Assert.assertTrue(result.contains("MARCH 1"));
//
//	 
//
//	 
//
//	List<WebElement> actual = Driver.getDriver().findElements(By.xpath("//div[@id='left1']//tr//td[1]"));
//
//	actual.add(0, Driver.getDriver().findElement(By.xpath("//div[@id='left1']//tr//th[1]")));
////	for(int i=0;i<actual.size();i++) {
////		System.out.println(actual.get(i).getText());
////		
////	}
////	 
//
//	 
//
//	String[] actualStr = new String[actual.size()];
//
//	int count = 0;
//
//	for(WebElement wb : actual) {
//
//	actualStr[count]=wb.getText();
//
//	count++;
//
//	}
//
//	String[] expected = {"Weather Element", "Temperature", "Dewpoint", "Humidity", "Barometer", "Wind Speed", "Wind Gust", "Precipitation"};
//
//	 
//
//	Assert.assertTrue(Arrays.equals(actualStr, expected));
//
//	 
//
//	 
//
//	 
//
//	 
//
//	}
//	

	
	@Test

	public void test2() throws InterruptedException {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		Assert.assertEquals(Driver.getDriver().getTitle(), ConfigurationReader.getProperty("title"));

		HomePage hm = new HomePage();

		String path = hm.FanhButton.getAttribute("src");
		Assert.assertTrue(path.contains("blue"));
		
		hm.NAButton.click();

		NorthAmericaPage na = new NorthAmericaPage();
		Assert.assertEquals(Driver.getDriver().getTitle(), ConfigurationReader.getProperty("NorthAmericaTitle"));
		
		na.USAlink.click();
		
		UnitedStatesPage usa = new UnitedStatesPage();
		Driver.getDriver().manage().window().fullscreen();
		Assert.assertEquals(Driver.getDriver().getTitle(),ConfigurationReader.getProperty("UnitedStatesTitle"));

		usa.DColumbiaLink.click();
		
		DistrictColombia dc = new DistrictColombia();

		dc.DCwash.click();
		Assert.assertEquals(Driver.getDriver().getTitle(),ConfigurationReader.getProperty("WashingtonTitle"));

	    WashingtonDC wdc = new WashingtonDC();

	    wdc.dailyAverages.click();

	String str = Driver.getDriver().getTitle();

	Assert.assertTrue(str.contains("Washington, District of Columbia - March"));

	 

	wdc.date.click();

	Thread.sleep(2000);

	String result = Driver.getDriver().findElement(By.xpath("(//div[@id='headerfont'])[5]")).getText();

	Assert.assertTrue(result.contains("MARCH 1"));

	

	Assert.assertTrue(WashingtonDC.checkIfFahren("//div[@id='left1']//tr[2]//td//sup"));

	Assert.assertTrue(WashingtonDC.checkIfFahren("//div[@id='left1']//tr[3]//td//sup"));

	 

//	wdc.celcius.click();
//
//	Assert.assertTrue(WashingtonDC.checkIfCelcius("//div[@id='left1']//tr[2]//td//sup"));
//
//	Assert.assertTrue(WashingtonDC.checkIfCelcius("//div[@id='left1']//tr[3]//td//sup"));
//
//	 

	 

	 

	}

	@AfterClass
   
	
	
	public void quit() throws InterruptedException {
    Thread.sleep(5000);
		Driver.getDriver().quit();

	}

	}
	
//	AgencyPage agencyPage;
//
//	@BeforeClass
//	public void setup() {
//		driver = Driver.getDriver("chrome");
//
//	}
//
//	// First Positive Test Case
//	@Test(priority = 1)
//	public void USAHM001() throws InterruptedException {
//		homePage = new HomePage(driver);
//		agencyPage = new AgencyPage(driver);
//
//		// Step 1
//		String exp = Config.getPropValue("url");
//		driver.get(Config.getPropValue("url"));
//		homePage.checkUrl(exp);
//		Thread.sleep(2000);
//		homePage.isAt();
//
//		// Step 2
//		Actions action = new Actions(driver);
//		action.moveToElement(homePage.profiles).perform();
//		homePage.agencies.click();
//		homePage.checkUrl(Config.getPropValue("urlAgency"));
//		Thread.sleep(2000);
//		homePage.isAt();
//
//		// Step 3
//		agencyPage.searchBox.click();
//		Thread.sleep(2000);
//		agencyPage.searchBox.sendKeys("Department of Homeland Security");
//		Assert.assertTrue(agencyPage.numberOfResult.isDisplayed());
//
//	}
//
//	// First Negative Test Case
//	@Test(priority = 2)
//	public void USAHM002() throws InterruptedException {
//		homePage = new HomePage(driver);
//		agencyPage = new AgencyPage(driver);
//
//		// Step 1
//		String exp = Config.getPropValue("url");
//		driver.get(Config.getPropValue("url"));
//		homePage.checkUrl(exp);
//		homePage.isAt();
//
//		// Step 2
//		Actions action = new Actions(driver);
//		Thread.sleep(2000);
//		action.moveToElement(homePage.profiles).perform();
//		homePage.agencies.click();
//		homePage.checkUrl(Config.getPropValue("urlAgency"));
//		homePage.isAt();
//
//		// Step 3
//		agencyPage.searchBox.click();
//		agencyPage.searchBox.sendKeys("babakuly");
//		Assert.assertTrue(agencyPage.numberOfResult.isDisplayed());
//		Assert.assertTrue(agencyPage.noResult.isDisplayed());
//
//	}
//
//	@Test(priority = 3)
//	public void USAHM003() throws InterruptedException {
//		homePage = new HomePage(driver);
//		agencyPage = new AgencyPage(driver);
//
//		// Step 1
//		String exp = Config.getPropValue("url");
//		driver.get(Config.getPropValue("url"));
//		Thread.sleep(2000);
//		homePage.checkUrl(exp);
//		homePage.isAt();
//
//		// Step 2
//		Actions action = new Actions(driver);
//		action.moveToElement(homePage.profiles).perform();
//		homePage.agencies.click();
//		homePage.checkUrl(Config.getPropValue("urlAgency"));
//		homePage.isAt();
//
//		// Step 3
//		Thread.sleep(2000);
//		String actual=agencyPage.BudgetaryResButton.getCssValue("color");
//		System.out.println("The actual color is: "+actual);
//		agencyPage.BudgetaryResButton.click();
//		String expected=agencyPage.BudgetaryResButtonDessen.getCssValue("color");
//		System.out.println("The changed color is: "+expected);
//		Assert.assertEquals(actual, expected);
//		
//		
//		Assert.assertTrue(agencyPage.BudgetaryResButtonDessen.isEnabled(), "Thec colo is not changed");
//		Assert.assertTrue(agencyPage.BudgetaryResButtonAssen.isEnabled(), "The color is changed");
//
//		// Step 4
//		agencyPage.BudgetaryResButtonAssen.click();
//		agencyPage.BudgetaryResButtonAssen.click();
//		Assert.assertTrue(agencyPage.BudgetaryResButtonAssen.isEnabled(), "The color is not changed");
//		System.out.println(agencyPage.BudgetaryResButtonAssen.isEnabled());
//		System.out.println(agencyPage.BudgetaryResButtonAssen.isSelected());
//
//	}
//
//	@Test(priority = 4)
//	public void USAHM004() throws InterruptedException {
//		homePage = new HomePage(driver);
//		agencyPage = new AgencyPage(driver);
//
//		// Step 1
//		String exp = Config.getPropValue("url");
//		driver.get(Config.getPropValue("url"));
//		Thread.sleep(2000);
//		homePage.checkUrl(exp);
//		homePage.isAt();
//
//		// Step 2
//		Actions action = new Actions(driver);
//		action.moveToElement(homePage.profiles).perform();
//		homePage.agencies.click();
//		homePage.checkUrl(Config.getPropValue("urlAgency"));
//		homePage.isAt();
//
//		// Step 3
//		String actual = driver
//				.findElement(By.xpath("//div[@class='agency-landing-results-table']/table/tbody/tr[1]/td[1]"))
//				.getText();
//		System.out.println(actual);
//
//		Thread.sleep(2000);
//		agencyPage.PercentOfTotalButton.click();
//		System.out.println("Target===> " + agencyPage.PercentOfTotalButtonDessen.getCssValue("color"));
//		Assert.assertTrue(agencyPage.PercentOfTotalButtonDessen.isEnabled(), "The color is not changed");
//		String expected = driver
//				.findElement(By.xpath("//div[@class='agency-landing-results-table']/table/tbody/tr[1]/td[1]"))
//				.getText();
//		System.out.println(expected);
//
//		Assert.assertNotEquals(actual, expected, "The table is changed, it's Dessending order now");
//
//	}

//}