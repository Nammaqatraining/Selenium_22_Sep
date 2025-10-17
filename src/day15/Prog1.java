package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 


public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		WebElement ele2 = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		
		System.out.println(ele1.getLocation().getX());
		System.out.println(ele1.getLocation().getY());
	
	
		System.out.println(ele2.getLocation().getX());
		System.out.println(ele2.getLocation().getY());
		
		int y1 = ele1.getLocation().getY();
		int y2 = ele2.getLocation().getY();
		
		if(y1 == y2) {
			System.out.println("First name and Last name text boxes are alligned properly in the same line");
		}
		
		int x1 = driver.findElement(By.xpath("//input[@value='Male']")).getLocation().getX();
		int x2 = driver.findElement(By.xpath("//input[@value='FeMale']")).getLocation().getX();
		
		if(x1 == x2) {
			System.out.println("Radio button are alligned properly");
		}
		else {
			System.out.println("Radio button are not alligned properly");
		}
		
	}

}
