package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page7.html");
		
		driver.findElement(By.cssSelector("a[id='Blogaward_id']")).click();
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a#Blogaward_id")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a.Blogaward_class")).click();
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.close();
	}

}
