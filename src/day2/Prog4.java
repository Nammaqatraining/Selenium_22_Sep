package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//get the url from the current browser window
		String enteredUrl = driver.getCurrentUrl();
		System.out.println("Entered url is "+enteredUrl);
		
		//get the title from the current browser window
		String titlePresent = driver.getTitle();
		System.out.println("Title of the current page is "+titlePresent);
		
		//get the page source from the current browser window
		String pageSource = driver.getPageSource();
		System.out.println("Page source of current page is "+pageSource);
		
		driver.close();
	}

}
