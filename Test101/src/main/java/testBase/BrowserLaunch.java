package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch extends BasePage {
	static WebDriver driver; // static-access modifier that makes webdriver global, initializing driver

	public static WebDriver browserSetup() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://techfios.com/test/107/");
		return driver;

	}

}
