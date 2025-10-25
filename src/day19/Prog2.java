package day19;

import java.io.IOException;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
		
		Thread.sleep(5000);
		//File upload
		//driver.findElement(By.xpath("//input[@onchange='uploadimg()']")).click();
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("C:\\Users\\Admin\\eclipse-workspace-java\\SeleniumPractice\\src\\misc\\fileUpload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
