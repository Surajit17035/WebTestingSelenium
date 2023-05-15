package MyTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {

	WebDriver driver = null;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/maity/eclipse-workspace/Selenium/driver/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test(retryAnalyzer=Retry.class)
	public void Youtube()
	{
		String validate = "YouTube open";
		driver.get("https://youtube.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, validate, "Title didn't match");
	}
	@AfterTest
	public void Close()
	{
		//driver.quit();
	}
	
	@Test
	public void windows()
	{
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
	}
	
	@Test
	public void linkOpenInNewTab()
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footerLink = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		int totlaLinkCount = footerLink.findElements(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul/li/a")).size();
		for(int i=0;i<=totlaLinkCount; i++)
		{
			String CTRLclick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerLink.findElements(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul/li/a")).get(i).sendKeys(CTRLclick);
			
			
		}
	}
	
}
