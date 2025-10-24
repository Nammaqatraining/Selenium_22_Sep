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


public class Prog5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Date date = new Date();
		System.out.println(date.toString());
	
		String todayDate[] = date.toString().split(" ");
		System.out.println(todayDate[2]);
		
		
		System.out.println(Integer.parseInt(todayDate[2])-1);
		
		
	}

}
