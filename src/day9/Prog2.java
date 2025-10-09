package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page1.html");
		
		driver.findElement(By.xpath("/html/body/input[@name='email']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='userName1']")).sendKeys("user1");
		
		driver.findElement(By.xpath("//input[@id='un2']")).sendKeys("user2");
		
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("pass");
		
		driver.findElement(By.xpath("//input[@placeholder='Pls enter phoneNumber']")).sendKeys("1234567");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		Thread.sleep(5000);
		//driver.close();
	}

}
