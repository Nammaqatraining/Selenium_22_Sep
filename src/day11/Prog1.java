package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page4.html");
		
		System.out.println(driver.findElement(By.xpath("//th[.='Student Name']/preceding-sibling::th")).getText());
		
		 System.out.println(driver.findElement(By.xpath("//th[.='Student Name']")).getText());
		 
		 System.out.println(driver.findElement(By.xpath("//th[.='Student Name']/following-sibling::th")).getText());
		 
		
		Thread.sleep(5000);
		//driver.close();
	}

}
