package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TessPage  extends BasePage{

	
	
	
	public TessPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	////a[text()='Desiree Fitness Tee']"
	
	//a[@class='product-item-link' and contains(@href, '" + product + "')]
	//a[@class='product-item-link' and  @href='https://magento.softwaretestingboard.com/desiree-fitness-tee.html']
	
	@FindBy(xpath = "//a")
	WebElement productSelection;
	
	public void SelectProduct(String product) {
		
		
		WebElement selection = driver.findElement(By.xpath("//a[@class='product-item-link' and  contains (@href,'https://magento.softwaretestingboard.com/"+product+".html')]"));
		selection.click();
	}

}
