package selenium;

import java.util.Properties;


import org.openqa.selenium.WebDriver;


public class Base {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public void closeBrowser()
	{
		driver.quit();
	}
	

}


