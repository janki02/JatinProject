package seleniumCode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClass {

	public static void main(String[] args){
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
	     Alert alert= driver.switchTo().alert();
	     
	     alert.accept();
		
	     driver.findElement(By.xpath("//utton[@onclick='jsConfirm()']")). click();
	     
	     WebDriverWait wait= new WebDriverWait(driver,20);
 	     wait.until(ExpectedConditions.alertIsPresent());
          Alert alert2= driver.switchTo().alert();
          
         
 	    
	     alert2.accept();
	     
	    
	     
//	 	
//  driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
//	     
//	     
//
//          Alert alert3= driver.switchTo().alert();
//         
//	     alert3.sendKeys("okuh	whgcgoúwhco	wugvciou	wvguiew	ffgv uiefgvuifgvifugv  ieghifegivuf	uivhof	v biu	wbi");
//	     
//	     
//	    alert3.accept();
	     
driver.close();
}}
