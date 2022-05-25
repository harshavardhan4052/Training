package client.cts.salary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lanchchrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91889\\eclipse-workspace\\Training\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8184967963");
		driver.findElement(By.name("pass")).sendKeys("Harsha@1234");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
