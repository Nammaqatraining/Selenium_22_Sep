package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 


public class Prog7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page3.html");
		
	
		WebElement multiSelect = driver.findElement(By.xpath("(//select[@id='cities_id'])[2]"));
		
		Select sel = new Select(multiSelect);
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		
		
		List<WebElement> selectedOptions = sel.getAllSelectedOptions();
		System.out.println("Number of Selected options are "+selectedOptions.size());
		
		for(int i=0;i<selectedOptions.size();i++) {
			WebElement option = selectedOptions.get(i);
			System.out.println(option.getText());
		}
	}

}
