package day16;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select; 


public class Prog3 {

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
		
		
		//Collect the parent window id
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent page window id is "+parentWindowId);
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		WebElement register = driver.findElement(By.xpath("//a[.='Register']"));
		action.keyDown(Keys.CONTROL).click(register).build().perform();
		
	

		Set<String> windowIds = driver.getWindowHandles();
		for(String handle:windowIds) {
			System.out.println("Window ids are "+handle);
			if(!handle.equals(parentWindowId)) {
				driver.switchTo().window(handle);
			}
			
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
