package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		//Relative css path with attributes
		
		driver.findElement(By.cssSelector("form[id='reg'] input[name='firstname']")).sendKeys("First name");
		
		driver.findElement(By.cssSelector("form[id='reg'] input[name='lastname']")).sendKeys("Last Name");
	
		driver.findElement(By.cssSelector("input[aria-label*='Mobile number']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.cssSelector("input[autocomplete*='pass']")).sendKeys("New pass");
		
		
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		
		Thread.sleep(5000);
		//driver.close();
	}

}
