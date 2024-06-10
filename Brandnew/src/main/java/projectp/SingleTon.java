package projectp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleTon {
	
	private static SingleTon instance;
	
	
	private SingleTon()
	{
		WebDriver driver = new ChromeDriver();
	}
	
	public static SingleTon getInstance()
	{
		if(instance==null)
		{
			instance = new SingleTon();
		}
		
		return instance;
	}

	public static SingleTon getInstance1() {
		// TODO Auto-generated method stub
		return null;
	}

}
