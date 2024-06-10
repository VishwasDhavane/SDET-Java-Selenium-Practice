package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    
	public HomePage(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//h1")
	WebElement Header;
	
	public void navigateTo(String categoryName, String productType) {
		
		WebElement category = driver.findElement(By.xpath("//nav[@class=\"navigation\"]//ul//span[text()='"+categoryName+"']"));
		new Actions(driver).moveToElement(category);
	
		WebElement productLink = driver.findElement(By.xpath("//*[@role=\"menu\"]//span[text()='"+productType+"']"));
		productLink.click();
	}

}
