package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page10.html");
		
		
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox' and @id='reports']"));
		
		for(int i=0;i<checkBox.size();i++) {
			checkBox.get(i).click();
		}
		
		for(int i=0;i<checkBox.size();i++) {
			checkBox.get(i).click();
		}
	}

}
