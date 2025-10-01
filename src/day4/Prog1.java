package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page7.html");
		
		
		WebElement inputBox = driver.findElement(By.name("n1"));
		Thread.sleep(5000);
		inputBox.clear();
		Thread.sleep(5000);
		inputBox.sendKeys("India");
		
		
		WebElement inputBox1 =  driver.findElement(By.id("i1"));
		Thread.sleep(5000);
		inputBox1.clear();
		Thread.sleep(5000);
		inputBox1.sendKeys("USA");
		
		
		WebElement inputBox2 =  driver.findElement(By.className("c1"));
		Thread.sleep(5000);
		inputBox2.clear();
		Thread.sleep(5000);
		inputBox2.sendKeys("UK");
		
		WebElement inputBox3 =  driver.findElement(By.tagName("input"));
		Thread.sleep(5000);
		inputBox3.clear();
		Thread.sleep(5000);
		inputBox3.sendKeys("Germany");
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
