package MyTest;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuth {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/maity/eclipse-workspace/Selenium/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://admin:admin@the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Basic Auth")).click();
		
		driver.manage().window().maximize();	
		driver.get("https://pdf.online/edit-pdf-text");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class*='select-files-button']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\maity\\OneDrive\\Documents\\Check\\fileUpload.exe");
		

	}
	

	

}
