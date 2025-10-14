package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page10.html");
		
		//click on 4th check box
		driver.findElement(By.xpath("(//input[@type='checkbox' and @id='reports'])[4]")).click();
		
		//click on last check box
		driver.findElement(By.xpath("(//input[@type='checkbox' and @id='reports'])[last()]")).click();
		
		//click on last but 1
		driver.findElement(By.xpath("(//input[@type='checkbox' and @id='reports'])[last()-1]")).click();
		
		
		driver.findElement(By.xpath("(//input[@type='checkbox' and @id='reports'])[position()=1]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox' and @id='reports'])[position()=last()]")).click();
		
		
		Thread.sleep(5000);
		//driver.close();
	}

}
