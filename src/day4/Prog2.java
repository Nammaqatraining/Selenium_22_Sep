package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page7.html");
		
		//driver.findElement(By.linkText("Blog award")).click();
		//Thread.sleep(5000);
		//driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Blog")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		
		driver.findElement(By.name("Blog award")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		
		driver.findElement(By.id("Blogaward_id")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.findElement(By.className("Blogaward_class")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.close();
	}

}
