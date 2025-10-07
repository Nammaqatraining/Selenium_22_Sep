package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Relative css path with attributes
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("ABC@gmail.com");
		
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("ABC");
		
		
		//driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		driver.findElement(By.cssSelector("a[class*='selected _51sy']")).click();
		
		Thread.sleep(5000);
		//driver.close();
	}

}
