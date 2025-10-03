package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page7.html");
		
		driver.findElement(By.cssSelector("a[href^='https']")).click();
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a[name^='Bl']")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a[id$='id']")).click();
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.close();
	}

}
