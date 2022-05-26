package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.jodah.failsafe.internal.util.Assert;

public class RemoveSingleList {
 
  WebDriver driver;
	
public RemoveSingleList(WebDriver driver) {
	
	this.driver = driver;	
	
	//Element Library========
	
}
@FindBy(how=How.NAME,using = "todo[8]")
WebElement SportsCategoryCHeckbox;

@FindBy(how=How.NAME,using = "submit")
WebElement RemoveButton;

//methods/actions=======
public void deleteSportsCategory() {
	SportsCategoryCHeckbox.click();
	RemoveButton.click();
//	Boolean checkbx = SportsCategoryCHeckbox.isDisplayed();
//
//	if(!checkbx == true)	{
//	Assert.isTrue(checkbx, "");
//		
//		System.out.println("category list not displayed");

		
		
//	}else {
//			
//	System.out.println("category list not deleted");	
//			
//	}

	}
public boolean deleteOneCategory() throws InterruptedException {
	SportsCategoryCHeckbox.click();
	Thread.sleep(5000);
	
	RemoveButton.click();
	
	return false;
	
	
	
}



}
