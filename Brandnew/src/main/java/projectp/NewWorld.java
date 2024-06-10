package projectp;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewWorld {
	
	
	public static void verifylink(String url) throws IOException
	{
		URL link = new URL(url);
		HttpURLConnection http =  (HttpURLConnection)link.openConnection();
		http.setConnectTimeout(3000);
		http.connect();
		
		if(http.getResponseCode()==200)
		{
			System.out.println("  "+http.getResponseMessage());
		}
		else
		{
			System.out.println("  "+http.getResponseMessage());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Barclays_switch_Workspace\\Brandnew\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//String a=driver.getTitle();
		System.out.println(driver.getTitle());
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		WebElement e= driver.findElement(By.xpath("//h1"));
		//actions class
		Actions action = new Actions(driver);
		
		action.moveToElement(e).click().sendKeys("hello world").doubleClick().contextClick().build().perform();
		
		//https://www.browserstack.com/guide/handling-tabs-in-selenium
		//https://www.browserstack.com/guide/handle-multiple-windows-in-selenium
		String parent = driver.getWindowHandle();
		Set<String> allhandles=driver.getWindowHandles();
		
		for(String a : allhandles)
		{
			
		}
		
	    Iterator<String> it= allhandles.iterator();
	    
	    while(it.hasNext())
	    {
	    	String child=it.next();
	    
	    
	    if(!parent.equals(child))
	    {
	    	driver.switchTo().window(child);
	    	System.out.println(driver.switchTo().window(child).getTitle());
	    	driver.close();
	    }
	
		
	    }
	    
	    driver.switchTo().window(parent);
	    
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    //js.executeScript(document.getElementById("Login").value="text");
		
		
		
		/*
		 * while(true) { List<WebElement> ele = driver.findElements(By.xpath(
		 * "//div[@class='maincounter-number']/span[@class='rts-counter']")); try {
		 * Thread.sleep(5000); for(WebElement e :ele) { System.out.println(e.getText());
		 * }
		 * 
		 * 
		 * } catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * break;
		 * 
		 * }
		 */
		
	    
	    //find all the broken links in the page
	    
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    
	    for(WebElement link : links)
	    {
	    	String url= link.getAttribute("href");
	    	//verifylink(url);
	    }
		
		while(true)
		{
		List<WebElement> ele1 = driver.findElements(By.xpath("//div[@class='col-sm-6 col-counters'][1]"));
		
		for(WebElement e1 :ele1)
		{
			System.out.println(e1.getText());
		}
		
		
	
		
		}
		
		
		
		
		
		
		
		

		/*
		 * while(true) { List<WebElement> ele2 =
		 * driver.findElements(By.xpath("//div[@class='col-sm-6 col-counters']/div/div")
		 * ); try { Thread.sleep(5000); for(WebElement e :ele2) {
		 * System.out.println(e.getText()); }
		 * 
		 * 
		 * } catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * break;
		 * 
		 * }
		 */
		

	}

}