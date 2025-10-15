package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page1.html");
		
		driver.findElement(By.xpath("//input[@id='un1']")).sendKeys("Bharath");
		driver.findElement(By.xpath("//input[@id='un1']")).sendKeys(Keys.CONTROL + "A");
		driver.findElement(By.xpath("//input[@id='un1']")).sendKeys(Keys.CONTROL + "C");
		driver.findElement(By.xpath("//input[@id='un1']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='un2']")).sendKeys(Keys.CONTROL + "V");
		driver.findElement(By.xpath("//input[@id='un2']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys(Keys.CONTROL + "V");
		
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@id='login']")).sendKeys(Keys.F5);
	}

}
