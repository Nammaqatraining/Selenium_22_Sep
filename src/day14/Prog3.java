package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 


public class Prog3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page3.html");
		
	
		WebElement multiSelect = driver.findElement(By.xpath("(//select[@id='cities_id'])[2]"));
		
		Select sel = new Select(multiSelect);
		
		List<WebElement> allOptions = sel.getOptions();
		System.out.println("Number of options present in multi select drop down is "+allOptions.size());
		
		for(int i=0;i<allOptions.size();i++) {
			WebElement option = allOptions.get(i);
			System.out.println(option.getText());
		}
		
	}

}
