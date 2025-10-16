package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 


public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page3.html");
		
	
		WebElement multiSelect = driver.findElement(By.xpath("(//select[@id='cities_id'])[2]"));
		Select sel = new Select(multiSelect);
		Thread.sleep(2000);
		sel.selectByVisibleText("Vizag");
		Thread.sleep(2000);
		sel.selectByContainsVisibleText("Hyder");
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("6");
		
		
		/*sel.deselectByVisibleText("Hyderabad");
		Thread.sleep(2000);
		sel.deSelectByContainsVisibleText("Viz");
		Thread.sleep(2000);
		sel.deselectByIndex(2);
		Thread.sleep(2000);
		sel.deselectByValue("6");*/
		
		sel.deselectAll();
		
	}

}
