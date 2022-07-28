package seleniumCode;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilities {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://technext.github.io/delicious/index.html");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(driver.findElement(By.xpath(""))))
		
		Actions action = new Actions (driver);
		action.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Pages']"))).perform();
    
		 List<WebElement> ele = driver.findElements(By.xpath("//body/header[@class='header-area']/div[@class='delicious-main-menu']/div[@class='classy-nav-container breakpoint-off light left']/div[@class='container']/nav[@id='deliciousNav']/div[@class='classy-menu']/div[@class='classynav']/ul/li[@class='cn-dropdown-item has-down']/ul[1]//li"));
		 System.out.println(ele.size());
		 
		 for(int i=0;i<ele.size();i++) {
			 
		String s=	 ele.get(i).getAttribute("innerHTML");
		System.out.println("----"+s);
			 if(s.contains("About Us")) {
				 ele.get(i).click();
				 break;
			 }
		 }
		
	   Select select = new Select(null);
	   

	}

}
