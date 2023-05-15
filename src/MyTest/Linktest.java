package MyTest;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Linktest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/maity/eclipse-workspace/Selenium/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement home = driver.findElement(By.xpath("//header/div/a"));
		Actions a = new Actions(driver);
		a.moveToElement(home).keyDown(Keys.CONTROL).click().build().perform();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String title = driver.getTitle();
		System.out.println(title);
		String name = driver.findElement(By.xpath("//div/div/div/div/div/a[text()='JOIN NOW']")).getText();
		System.out.println(name);
	}

}
