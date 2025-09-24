package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Prog4 {

	
	public ChromeDriver openBrowser(ChromeDriver driver) {
		return driver;
	}
	
	public FirefoxDriver openBrowser(FirefoxDriver driver) {
		return driver;
	}
	
	public InternetExplorerDriver openBrowser(InternetExplorerDriver driver) {
		return driver;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog4 obj = new Prog4();
		obj.openBrowser(new ChromeDriver()).get("https://www.facebook.com/");
		obj.openBrowser(new FirefoxDriver()).get("https://www.flipkart.com/");
		obj.openBrowser(new InternetExplorerDriver()).get("https://www.amazon.in/");
	}

}
