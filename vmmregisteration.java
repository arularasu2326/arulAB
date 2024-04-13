package testNGpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class vmmregisteration {
	
	@Test
	public void signup() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver"
				,"C:\\chromdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		WebDriver driver = new ChromeDriver(options);	 
		driver.get("https://accounts.vmmaps.com/");
		
	  driver.findElement(By.id("registerHere")).click();
	  driver.findElement(By.id("signup-username")).sendKeys("arularasu");
	  driver.findElement(By.id("signup-email")).sendKeys("arularasu2611@gmail.com");
	  driver.findElement(By.id("signup-mobile")).sendKeys("7708226683");
	  driver.findElement(By.id("signup-password")).sendKeys("Arulbhuvi@2326");
	  driver.findElement(By.id("signup-confirmPassword")).sendKeys("Arulbhuvi@2326");
	  driver.findElement(By.id("terms-vms-policy")).click();
	  driver.findElement(By.id("newsLetter")).click(); 
	  driver.findElement(By.id("signup-submit-text")).click();
	  driver.close();
	  
	  
		

	}

}
 