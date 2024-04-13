package testNGpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class vmmlogin {

	@Test
	public void logIn() {
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
		
		driver.findElement(By.id("login-email")).sendKeys("arularasu2611@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Arulbhuvi@2326");
		driver.findElement(By.id("loginSubmit")).click();
		driver.quit();
		
	
    
	}

}
