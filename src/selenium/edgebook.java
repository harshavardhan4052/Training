package selenium;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.CharMatcher;

public class edgebook {
	
	public static WebDriver driver;
	private static Scanner input;
	private static int theDigits;
	private List<WebElement> Details;
	private Iterator<WebElement> itr;
	private JavascriptExecutor js;
	

		
		//Choosing web driver with the help of user input which is passed as argument.
     
	@SuppressWarnings("unchecked")
	public void task1(WebDriver driver){
		
		//task 1 comprises Listing Category and Count of Books in console.
		
		js = (JavascriptExecutor)driver;
		Details = (List<WebElement>) js.executeScript("return document.querySelectorAll('#categories_carousel > div > div p')");
		System.out.println("Displaying Details of the Books:");
		itr = Details.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getAttribute("innerText"));
		}
	}
	
	public String task2(WebDriver driver){
		
		//task 2 comprises Browsing the books with respective to Subject and 
		//Add a check point to validate whether "Tamil" total books is having an integer value more than one.
		//Here we are returning only the value and checking it in main()
		
		WebElement browse = driver.findElement(By.xpath("//*[contains(text(),'Browse')]"));
		Actions act = new Actions(driver);
		act.moveToElement(browse).build().perform();
		WebElement subject = driver.findElement(By.xpath("//*[text()='Subjects']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(subject));
		subject.click();
		driver.findElement(By.xpath("//*[contains(text(),'See more')]")).click();
		String num = driver.findElement(By.xpath("//*[text()='Tamil']/parent::*/span/b")).getText();
		return num;
	}
	
	public void closeWebDriver(WebDriver driver){
		driver.quit();
	}
	
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws RuntimeException{
		edgebook b1 = new edgebook();
		//Launching browser as per the user input
		System.out.println("Select your browser:\n1.Edge\n2.Chrome");
		input = new Scanner(System.in);
		int n = input.nextInt();
        if(n==1) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\91889\\eclipse-workspace\\Training\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		EdgeOptions eo = new EdgeOptions();
		eo.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://openlibrary.org/");
		//calling task1
		 b1.task1(driver);
		   
		    System.out.println("\n-------------------------\n");
		    //calling task2 and converting string to integer
		    String temp = CharMatcher.inRange('0', '9').retainFrom(b1.task2(driver));
			theDigits = Integer.parseInt(temp);
			if(theDigits > 1000)
				System.out.println("Total Tamil Books is " + theDigits +
				"\nTherefore Tamil total books is having an integer value more than one thousand");
			else
				System.out.println("Total Tamil Books is " + theDigits +
				"\nTamil total books is not having an integer value more than one thousand");
		    b1.closeWebDriver(driver);

       }
         else if(n==2){
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91889\\eclipse-workspace\\Training\\driver\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://openlibrary.org/");
			//calling task1
			b1.task1(driver);
			   
		    System.out.println("\n-------------------------\n");
		    //calling task2 and converting string to integer
		    String temp = CharMatcher.inRange('0', '9').retainFrom(b1.task2(driver));
			theDigits = Integer.parseInt(temp);
			if(theDigits > 1000)
				System.out.println("Total Tamil Books is " + theDigits +
				"\nTherefore Tamil total books is having an integer value more than one thousand");
			else
				System.out.println("Total Tamil Books is " + theDigits +
				"\nTamil total books is not having an integer value more than one thousand");
		    b1.closeWebDriver(driver);

        }
	    
	    
	}
}


