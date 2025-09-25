package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.flipkart.com/");
		
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.get("https://www.amazon.in/");
	}

}
