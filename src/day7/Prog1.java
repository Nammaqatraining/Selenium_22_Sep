package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Relative css path with index - when there are no additional attributes present
		
		driver.findElement(By.cssSelector("form[data-testid='royal_login_form'] div:nth-child(1) input:nth-child(1)")).sendKeys("ABC@gmail.com");
		
		driver.findElement(By.cssSelector("form[data-testid='royal_login_form'] div:nth-child(2) input:nth-child(1)")).sendKeys("ABC");
		
		Thread.sleep(5000);
		//driver.close();
	}

}
