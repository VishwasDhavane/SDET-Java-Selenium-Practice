package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//li//a")
	WebElement header;
	
	public void navigateTo(String categoryName, String subCategogyName, String productType) throws InterruptedException {
		Thread.sleep(4000);
		
		WebElement category = driver.findElement(By.xpath("//nav[@class='navigation']//ul//li//a[text()='"+categoryName+"']"));
		new Actions(driver).moveToElement(category);
		
		Thread.sleep(1000);
		WebElement subCategory = driver.findElement(By.xpath("//*[@role=\"menu\"]//span[text()='"+subCategogyName+"']"));
		new Actions(driver).moveToElement(subCategory);
	
		WebElement productLink = driver.findElement(By.xpath("//*[@role=\"menu\"]//span[text()='"+productType+"']"));
		productLink.click();
	}
	
}