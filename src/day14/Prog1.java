package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 


public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page3.html");
		
	
		WebElement singleSelect = driver.findElement(By.xpath("(//select[@id='cities_id'])[1]"));
		Select sel = new Select(singleSelect);
		Thread.sleep(2000);
		sel.selectByVisibleText("Vizag");

		String firstOption1 = sel.getFirstSelectedOption().getText();
		System.out.println(firstOption1);
		
		Thread.sleep(2000);
		sel.selectByContainsVisibleText("Hyder");
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("6");
		
		
		String firstOption = sel.getFirstSelectedOption().getText();
		System.out.println(firstOption);
		
	}

}
