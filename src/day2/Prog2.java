package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Prog2 {

	
	
	public WebDriver openBrowser(WebDriver driver) {
		return driver;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;

		
		Prog2 obj = new Prog2();
		driver = obj.openBrowser(new ChromeDriver());
		driver.get("https://www.facebook.com/");
		driver.quit();
		
		driver = obj.openBrowser(new FirefoxDriver());
		driver.get("https://www.flipkart.com/");
		
		//driver = obj.openBrowser(new InternetExplorerDriver());
		//driver.get("https://www.amazon.in/");
		
		driver.quit();
	}

}
