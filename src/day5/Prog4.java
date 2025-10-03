package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page7.html");
		
		driver.findElement(By.cssSelector("a[name*='aw']")).click();
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a[id*='rd']")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a[class*='wa']")).click();
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.close();
	}

}
