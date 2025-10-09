package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page1.html");
		
		driver.findElement(By.xpath("/html/body/input[4]")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[1]")).sendKeys("user1");
		
		driver.findElement(By.xpath("//input[2]")).sendKeys("user2");
		
		driver.findElement(By.xpath("//input[3]")).sendKeys("pass");
		
		driver.findElement(By.xpath("//input[5]")).sendKeys("1234567");
		
		driver.findElement(By.xpath("//input[6]")).click();
		
		
		Thread.sleep(5000);
		//driver.close();
	}

}
