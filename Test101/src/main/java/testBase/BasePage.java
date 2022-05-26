package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	public static void waitForElement(WebElement element, WebDriver driver) {

	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.visibilityOf(element));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	}

}
