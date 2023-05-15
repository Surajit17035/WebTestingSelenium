package MyTest;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/maity/eclipse-workspace/Selenium/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", 
				Arrays.asList("disable-popup-blocking"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// iframe + login 
//		driver.get("https://www.reddit.com/");
//		driver.findElement(By.cssSelector("._3Wg53T10KuuPmyWOMWsY2F")).click();
//		WebElement frame = driver.findElement(By.cssSelector("._25r3t_lrPF3M6zD2YkWvZU"));
//		driver.switchTo().frame(frame);
//		driver.findElement(By.id("loginUsername")).sendKeys("lss_mobile_6101");
//		driver.findElement(By.id("loginPassword")).sendKeys("asdfasdf12");
//		driver.findElement(By.cssSelector(".m-full-width")).click();
		
		// windows handle
//		
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		
//		Actions a = new Actions(driver);
//		WebElement Home = driver.findElement(By.cssSelector(".btn.btn-primary"));
//		a.moveToElement(Home).keyDown(Keys.CONTROL).click().build().perform();
//		
//		Set<String> windowHandle = driver.getWindowHandles();
//		Iterator<String> it = windowHandle.iterator();
//		String oldWin = it.next();
//		String newWin = it.next();
//		driver.switchTo().window(newWin);
//		String heading = driver.findElement(By.xpath("//div[@class='container-fluid']//h2//span[1]")).getText();
//		System.out.println(heading);
//		driver.close();
//		driver.switchTo().window(oldWin);
//		driver.close();
		
		// calendar handle
		
		driver.get("https://www.cleartrip.com/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='px-1   flex flex-middle nmx-1 pb-1']")));
		driver.findElement(By.cssSelector("div[class='px-1   flex flex-middle nmx-1 pb-1']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".homeCalender .flex-middle")));
		driver.findElement(By.cssSelector(".homeCalender .flex-middle")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\\\"DayPicker-Caption\\\"] /div")));
		List<WebElement> month = driver.findElements(By.xpath("//div[@class=\"DayPicker-Caption\"] /div"));
//		for(int i =0; i< month.size(); i++)
//		{
//			String mName = month.get(i).getText();
//			while(!mName.contains("April"))
//			{
//				driver.findElement(By.xpath("//div[@class='flex-1 ta-right']//*[name()='svg']")).click();
//			
//			}
//			
//			List<WebElement> date = driver.findElements(By.cssSelector(".Day-grid .day-gridContent"));
//			int count = date.size();
//			for(int a=0; a<count; a++)
//			{
//				String text = date.get(a).getText();
//				if(text.equalsIgnoreCase("14")) {
//					driver.findElements(By.cssSelector(".Day-grid .day-gridContent")).get(i).click();				}
//			}
//				
//			
//			
//		}
		
		List<WebElement> date = driver.findElements(By.cssSelector(".Day-grid .day-gridContent"));
		int count = date.size();
		for(int i=0;i<count; i++) {
			String text = driver.findElements(By.cssSelector(".Day-grid .day-gridContent")).get(i).getText();
			if(text.equalsIgnoreCase("14")) {
				driver.findElements(By.cssSelector(".Day-grid .day-gridContent")).get(i).click();
			}
		}
		
		
		
		
	}

}
