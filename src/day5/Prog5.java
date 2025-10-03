package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		
	
		driver.findElement(By.cssSelector("input[type*='wo']")).sendKeys("abc");
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
