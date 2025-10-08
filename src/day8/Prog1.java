package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page6.html");
		
		
		WebElement link = driver.findElement(By.cssSelector("#Blogaward_id"));
		String tagName = link.getTagName();
		System.out.println("Tag name is "+tagName);
		
		String attributeValue = link.getAttribute("id");
		System.out.println("Attribute value is "+attributeValue);
		
		String text = link.getText();
		System.out.println("Text appeared is "+text);
		
		Thread.sleep(5000);
		driver.close();
	}

}
