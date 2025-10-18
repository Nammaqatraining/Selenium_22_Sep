package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select; 


public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		//Mouse over actions
		WebElement interactions = driver.findElement(By.xpath("//a[.='Interactions ']"));
		Actions action = new Actions(driver);
		action.moveToElement(interactions).perform();
		
		WebElement dragAndDrop = driver.findElement(By.xpath("//a[.='Drag and Drop ']"));
		action.moveToElement(dragAndDrop).perform();
		
		WebElement static_drag_drop = driver.findElement(By.xpath("//a[.='Static ']"));
		action.moveToElement(static_drag_drop).click().perform();
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);

		WebElement source = driver.findElement(By.id("angular"));
		WebElement destination = driver.findElement(By.id("droparea"));
		
		action.dragAndDrop(source, destination).release().perform();
		

	}

}
