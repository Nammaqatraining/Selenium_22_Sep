package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page8.html");
		
		driver.findElement(By.cssSelector("html>body>input:nth-child(1)")).sendKeys("ABC");
		
		driver.findElement(By.cssSelector("html>body>input:nth-child(2)")).sendKeys("ABC");
		
		Thread.sleep(5000);
		//driver.close();
	}

}
