package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select; 


public class Prog4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page11.html");
		
		driver.findElement(By.id("a1")).sendKeys("A");
		driver.findElement(By.id("b1")).sendKeys("B");
		
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("c1")).sendKeys("C");
		driver.findElement(By.id("d1")).sendKeys("D");
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("a1")).sendKeys("A");
		driver.findElement(By.id("b1")).sendKeys("B");
		
		
		driver.switchTo().frame("if1");
		driver.findElement(By.id("c1")).sendKeys("C");
		driver.findElement(By.id("d1")).sendKeys("D");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("a1")).sendKeys("A");
		driver.findElement(By.id("b1")).sendKeys("B");
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='nf1']")));
		driver.findElement(By.id("c1")).sendKeys("C");
		driver.findElement(By.id("d1")).sendKeys("D");
		
	}

}
