package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page4.html");
		
		
		WebElement ele1 = driver.findElement(By.xpath("//td[text()='ACD']"));
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("th")).above(ele1)).getText());
		
		WebElement ele2 = driver.findElement(By.xpath("//td[text()='EFG']"));
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("td")).below(ele2)).getText());
		
		WebElement ele3 = driver.findElement(By.xpath("//td[text()='EFG']"));
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("td")).toLeftOf(ele3)).getText());
		
		WebElement ele4 = driver.findElement(By.xpath("//td[text()='EFG']"));
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(ele4)).getText());
		
		System.out.println(driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(ele4)).getText());
		
	}

}
