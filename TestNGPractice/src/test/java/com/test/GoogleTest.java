package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Barclays_switch_Workspace\\TestNGPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.google.com/");

		// Wait<WebDriver> wait = new FluentWait<>(driver)
		// .withTimeout(Duration.ofSeconds(10))
		// .pollingEvery(Duration.ofMillis(500)) // Optional: Set the polling interval
		// .ignoring(org.openqa.selenium.NoSuchElementException.class);

	}

	@Test
	public void DynamicTable() throws InterruptedException {

		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Testing");

		// ul[@role='listbox']//li

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("the number of testing outcomes : " + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());

			if (list.get(i).getText().equals("testing jobs in pune")) {
				list.get(i).click();
				break;
			}
		}

	}

	@AfterMethod
	public void tearDOwn() {
		driver.close();
	}

}
