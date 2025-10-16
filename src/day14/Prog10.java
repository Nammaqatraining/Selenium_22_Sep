package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 


public class Prog10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page3.html");
		
	
		WebElement multiSelect = driver.findElement(By.xpath("(//select[@id='cities_id'])[1]"));
		
		Select sel = new Select(multiSelect);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("plese enter the text which you want to select");
		String reqText = sc.next();
		System.out.println("Entered value is "+reqText);
		
		sel.selectByVisibleText(reqText);
		
		String firstOption = sel.getFirstSelectedOption().getText();
		System.out.println("Selected options is"+firstOption);
	}

}
