package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(2000);
		//navigating back
		driver.navigate().back();
		
		Thread.sleep(2000);
		//navigating forward
		driver.navigate().forward();
		
		Thread.sleep(2000);
		//refreshing the current page
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
