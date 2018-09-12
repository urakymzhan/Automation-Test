package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DistrictColombia;
import pages.HomePage;
import pages.NorthAmericaPage;
import pages.UnitedStatesPage;
import pages.WashingtonDC;
import utitlities.ConfigurationReader;
import utitlities.Driver;

public class SmokeTest {

	@Test
	public void SmokeTest() throws InterruptedException {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		Assert.assertEquals(Driver.getDriver().getTitle(), ConfigurationReader.getProperty("title") );
		Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigurationReader.getProperty("url") );



		HomePage hp = new HomePage();

		//	Driver.getDriver().findElement(By.xpath("//img[@scr='/gr/f-head-blue.png']"));
		WebElement element = hp.FanhButton;
		String path =element.getAttribute("src");
		//String path = hp.FanhButton.getAttribute("src");
		// Assert.assertTrue(path.contains("blue"));
		Assert.assertTrue(path.contains("/gr/f-head-blue.png"));
		//    Thread.sleep(3000);

		hp.NAButton.click();

		Assert.assertEquals(Driver.getDriver().getTitle(), ConfigurationReader.getProperty("NorthAmericaTitle") );
		Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigurationReader.getProperty("NorthAmericaUrl") );

		NorthAmericaPage NAPage= new NorthAmericaPage();


		NAPage.USAlink.click();


		Assert.assertEquals(Driver.getDriver().getTitle(), ConfigurationReader.getProperty("UnitedStatesTitle") );
		Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigurationReader.getProperty("UnitedStatesUrl") );

		UnitedStatesPage USpage = new UnitedStatesPage();

		//	Thread.sleep(3000);

		//	WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 8);
		Driver.getDriver().manage().window().fullscreen();
		USpage.DColumbiaLink.click();

		Assert.assertEquals(Driver.getDriver().getTitle(), ConfigurationReader.getProperty("ColombiaTitle") );
		Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigurationReader.getProperty("ColombiaUrl") );


		DistrictColombia wash = new DistrictColombia();
		wash.DCwash.click();

		
		WashingtonDC washDC = new WashingtonDC();
		Assert.assertEquals(Driver.getDriver().getTitle(), ConfigurationReader.getProperty("WashingtonTitle") );
		Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigurationReader.getProperty("WashingtonUrl") );
		// Driver.getDriver().findElement(By.id("query")).sendKeys("Chicago");
//		Thread.sleep(3000);
//		Driver.getDriver().quit();

	}

}
