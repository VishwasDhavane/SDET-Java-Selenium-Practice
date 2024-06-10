package projectp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Project_2 {


	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Barclays_switch_Workspace\\Brandnew\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.noon.com/uae-en/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//String a=driver.getTitle();
		//System.out.println(driver.getTitle());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// js.executeScript("window.scrollBy(0, 1000);");
			
		 js.executeScript("window.scrollBy(0, 1000);");
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@data-qa='product-name']"));
		//WebElement m=driver.findElement(By.xpath("//div[@data-qa='product-name']"));
		//System.out.println(m.getAttribute("title"));
		
		
		Thread.sleep(5000);
		
		// js.executeScript("window.scrollBy(0, 1000);");
		
		for(WebElement e :ele)
		{
			
			 String title = (String) js.executeScript("return arguments[0].getAttribute('title');", e);
	         System.out.println(title);
			//String f=e.getAttribute("title");
			//System.out.println(e.getAttribute("title"));
			//System.out.println(e.getText());
			
			
		}
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
