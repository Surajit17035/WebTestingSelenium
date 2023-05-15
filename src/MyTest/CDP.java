package MyTest;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v104.emulation.Emulation;

public class CDP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/maity/eclipse-workspace/Selenium/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DevTools devTools= driver.getDevTools();
		devTools.createSession();
		// device matrix
//		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
//		
//		driver.get("https://www.selenium.dev/documentation/webdriver/bidirectional/chrome_devtools/");
//		driver.findElement(By.cssSelector(".navbar-toggler")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Documentation")).click();
		
// Geo Location
		Map<String, Object> coordinates = new HashMap<String, Object>();
		coordinates.put("latitude", 40);
		coordinates.put("longitude", 3);
		coordinates.put("accuracy", 1);
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		String title  = driver.findElement(By.cssSelector(".our-story-card-title")).getText();
		System.out.println(title);
		
	}

}
