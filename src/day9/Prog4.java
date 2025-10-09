package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page6.html");
		
		driver.findElement(By.xpath("/html/body/a[text()='Blog award']")).click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Blog award']")).click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/a[.='Blog award']")).click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[.='Blog award']")).click();
		
		driver.navigate().back();
		
		
		
		Thread.sleep(5000);
		//driver.close();
	}

}
