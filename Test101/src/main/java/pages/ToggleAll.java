package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.jodah.failsafe.internal.util.Assert;

public class ToggleAll {

WebDriver driver;

public ToggleAll(WebDriver driver) {
	
	this.driver = driver;
	

}
//==================Element library=================
@FindBy(how=How.NAME,using = "allbox")
WebElement ToggleAllCheckbox;

@FindBy(how=How.NAME,using = "todo[0]")
WebElement FoodCategoryCheckbox;


@FindBy(how=How.NAME,using = "todo[1]")
WebElement SportsCategoryCHeckbox;

@FindBy(how=How.ID,using = "todo[2]")
WebElement GroceryCategoryCheckbox;

@FindBy(how=How.ID,using = "//input[@name='data']")
WebElement textBox;
@FindBy(how=How.ID,using = "//input[@value='Add']")
WebElement addButton;
//=====================Methods/actions============
public void addNames() {
	textBox.sendKeys("Chelsea");
	addButton.click();
	textBox.sendKeys("Ramond");
	addButton.click();
	textBox.sendKeys("Brittney");
	addButton.click();
	textBox.sendKeys("David");
	addButton.click();
	textBox.sendKeys("George");
	addButton.click();
	textBox.sendKeys("Ronald");
	addButton.click();
	textBox.sendKeys("Stacy");
	addButton.click();
	textBox.sendKeys("Jeremiah");
	addButton.click();
	textBox.sendKeys("Wilson");
	addButton.click();
	textBox.sendKeys("Andrea");
	addButton.click();
}
public void toggleAllCheckbox() {
	ToggleAllCheckbox.click();	
	
Boolean checkbx = ToggleAllCheckbox.isEnabled();

if(checkbx == true)	{
Assert.isTrue(checkbx, "");
	
	System.out.println("check box checked");

	
	
}else {
		
System.out.println("check box not checked");	
		
}

	
	
	
	
}












}
