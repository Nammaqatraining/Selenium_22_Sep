package day18;

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


public class Prog4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();
		
		
		Date date = new Date();
		String todayDate[] = date.toString().split(" ");
		
		//current date
		driver.findElement(By.xpath("//a[.="+todayDate[2]+"]")).click();
	
		Thread.sleep(5000);
		
		//Tomo date
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();
		int tomoDate = Integer.parseInt(todayDate[2])+1;
		driver.findElement(By.xpath("//a[.="+tomoDate+"]")).click();
	}

}
