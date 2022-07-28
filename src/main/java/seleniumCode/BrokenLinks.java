package seleniumCode;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(
				"https://www.amazon.com/?tag=hymsabk-20&ref=pd_sl_290dlthsvm_e&adgrpid=1341404752168026&hvadid=83838035949211&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=65216&hvtargid=kwd-83838147155260:loc-190&hydadcr=28884_14559613");

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println(list.size());

		for (WebElement e : list) {

			String url = e.getAttribute("href");

			link(url);

		}

		driver.close();

	}

	public static void link(String urlList) {

		try {
			URL url = new URL(urlList);

			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.setConnectTimeout(5000);
			http.connect();

			if (http.getResponseCode() >= 400) {

				System.out.println(urlList + "response -->" + http.getResponseMessage() + "---->Brokan links");
			} else {
				System.out.println(urlList + "Response-->" + http.getResponseMessage());
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
