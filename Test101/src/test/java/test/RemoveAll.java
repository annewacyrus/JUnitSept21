package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.RemoveAllPage;
import testBase.BrowserLaunch;

public class RemoveAll {
 WebDriver driver;


	@Test
	public void RemoveAllListedItems(){
	
	driver = BrowserLaunch.browserSetup();	
	RemoveAllPage remove = PageFactory.initElements(driver, RemoveAllPage.class);	
	
	remove.UserShldBeAbleToRemoveAllItems();
	
	
Assert.assertTrue(remove.checkIfAllBoxesSelected());
	
	
	
//	Boolean result = remove.checkIfAllBoxesSelected();
//	System.out.println("All Selected" + result);
//	if (!result) {
//		remove.UserShldBeAbleToRemoveAllItems();
//		Assert.assertTrue("All Deleted", remove.checkIfAllBoxesSelected());
//	}
//remove.checkIfAllBoxesSelected();
}
	
	



}
