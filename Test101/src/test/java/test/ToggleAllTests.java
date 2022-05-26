package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.ToggleAll;
import testBase.BrowserLaunch;

public class ToggleAllTests {

	WebDriver driver;

	@Test

	public void userShouldBeAbleToToggleAll() {

		driver = BrowserLaunch.browserSetup();

		ToggleAll toggle = PageFactory.initElements(driver, ToggleAll.class);
		toggle.addNames();
		toggle.toggleAllCheckbox();

	}

}
