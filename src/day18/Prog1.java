package day18;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select; 


public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		//Mouse over actions
		WebElement swithcToo = driver.findElement(By.xpath("//a[.='SwitchTo']"));
		Actions action = new Actions(driver);
		action.moveToElement(swithcToo).perform();
		
		WebElement alerts = driver.findElement(By.xpath("//a[.='Alerts']"));
		action.moveToElement(alerts).click().perform();
		
		driver.findElement(By.xpath("(//button[contains(text(),'click the button to display')])[1]")).click();
		
		//To handle the java script alerts
		String textMsgFromAlert = driver.switchTo().alert().getText();
		System.out.println("Java script popup text is "+textMsgFromAlert);
		
		
		Thread.sleep(5000);
		//Click on OK button
		driver.switchTo().alert().accept();
		
		
	}

}
