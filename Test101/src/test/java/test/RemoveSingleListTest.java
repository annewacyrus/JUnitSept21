package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.RemoveSingleList;
import testBase.BrowserLaunch;

public class RemoveSingleListTest {

	WebDriver driver;

@Test
public void RemoveOneCategory() throws InterruptedException {
	driver = BrowserLaunch.browserSetup();
//	System.out.println("Before deleting: "+ driver.findElement(By.xpath("//input[@type='checkbox']")))
	RemoveSingleList obj = PageFactory.initElements(driver,RemoveSingleList.class);
   obj.deleteOneCategory();
   



}
}
