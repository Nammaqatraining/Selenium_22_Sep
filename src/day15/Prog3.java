package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select; 


public class Prog3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().deleteCookieNamed("cookie name");
		
		WebElement ele1 = driver.findElement(By.xpath("//h1[.='Automation Demo Site ']"));
		
		
		String value = ele1.getCssValue("color");
		String hexaValue = Color.fromString(value).asHex();
		
		System.out.println(hexaValue);
		
		if(hexaValue.contains("02569c")) {
			System.out.println("Dark blue is present on text Automation Demo Site");
		}
		else {
			System.out.println("Color has changed");
		}
		
	}

}
