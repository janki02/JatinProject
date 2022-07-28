package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDom {

	public static void main(String[] args) throws InterruptedException {

		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		  //  driver.manage().window().maximize();
		    driver.get("https://www.google.com");
		    
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    
		WebElement   ele= (WebElement) js.executeAsyncScript("return document.querySelector(\"body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input\")");
		
		Thread.sleep(20000);
		  String j="arguments[0].setAttribute('value','pitzaa')";
		  
		  WebDriverWait wait= new WebDriverWait(driver, 20);
				  wait.until(ExpectedConditions.visibilityOfElementLocated((By) ele));
            js.executeScript(j, ele);
		
	}

	
}
