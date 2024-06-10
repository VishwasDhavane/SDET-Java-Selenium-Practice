package pages;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductsPage  extends BasePage {

	public ProductsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a")
	WebElement productSelection;
	
	public void getSize(String size)
	{
		WebElement SizeSelection= driver.findElement(By.xpath("//div[@aria-label='"+size+"']"));
		SizeSelection.click();
		
	}
	
	
	public void getColour(String clour)
	{
		WebElement SizeSelection= driver.findElement(By.xpath("//div[@aria-label='"+clour+"']"));
		SizeSelection.click();
		
	}
	
	public void AddtoCart()
	{
		WebElement SizeSelection= driver.findElement(By.xpath("//button[@type='submit' and @title='Add to Cart']"));
		SizeSelection.click();
		
	}
	
	
	public void verifyAdded()
	{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement cartvalidation= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://magento.softwaretestingboard.com/checkout/cart/' and contains(text(),'shopping cart')]//parent::div")));
		String expected=cartvalidation.getText();
		String actual="You added '"+driver.getTitle()+"' to your";
		
		Assert.assertTrue(cartvalidation.isDisplayed(),"You added '"+driver.getTitle()+"' to your");
		
	}
	
	
	
	
	

}
