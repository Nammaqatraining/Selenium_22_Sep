package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait; 


public class Prog3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		driver.findElement(By.linkText("Practice Site")).click();
		
		driver.findElement(By.xpath("//a[.='My Account']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("My Account"));
		wait.until(ExpectedConditions.urlContains("my-account"));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		
		driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
		
		
		
		
	}

}
