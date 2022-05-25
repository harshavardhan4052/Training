import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91889\\eclipse-workspace\\Training\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://openlibrary.org/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		List<WebElement> Details = (List<WebElement>) js.executeScript("return document.querySelectorAll('#categories_carousel > div > div p')");
		System.out.println("Displaying Details of the Books:");
		Iterator<WebElement> itr = Details.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getAttribute("innerText"));
		WebElement br = driver.findElement(By.xpath("//*[@id=\"header-bar\"]/ul[1]/li[1]/div/details"));
		br.click();
		WebElement sb = driver.findElement(By.xpath("//*[@id=\"header-bar\"]/ul[1]/li[1]/div/details/div/ul/li[1]/a"));
		sb.click();
		WebElement smp = driver.findElement(By.xpath("//*[@id=\"subjectsPage\"]/ul[13]/li[9]/a"));
		smp.click();
		WebElement lang = driver.findElement(By.xpath("//*[@id=\"contentBody\"]/ul/li[38]/span/b"));
		lang.click();
		WebElement nobook = driver.findElement(By.xpath("//*[@id=\"contentBody\"]/ul/li[38]/span/b"));
		String count = nobook.getText();
		WebElement tamil = driver.findElement(By.xpath("//*[@id=\"contentBody\"]/ul/li[38]/a"));
		tamil.click();
		System.out.println(count);
		String txt=driver.getTitle();
		System.out.println(txt);
		
		// TODO Auto-generated method stub
		}
	}
}



