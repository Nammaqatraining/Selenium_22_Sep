package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 


public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		WebElement ele2 = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		
		int w1 = ele1.getSize().getWidth();
		int w2 = ele2.getSize().getWidth();
		
		int h1 = ele1.getSize().getHeight();
		int h2 = ele2.getSize().getHeight();
		
		if(w1==w2 && h1==h2) {
			System.out.println("Both are having same dimensions");
		}
	}

}
