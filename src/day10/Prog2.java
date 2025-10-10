package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page4.html");
		
		System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]")).getText());

		System.out.println(driver.findElement(By.xpath("//tr[2]/td[2]")).getText());

		
		String tagName = driver.findElement(By.xpath("//th[contains(text(),'SI')]/../../..")).getTagName();
		System.out.println("Obtained parent tag name is "+tagName);
		
		
		String border = driver.findElement(By.xpath("//th[contains(text(),'SI')]/../../..")).getAttribute("border");
		System.out.println("Obtained attribute value is "+border);
		
		
		//Fetch all the SI column
		for(int i=2;i<=4;i++) {
			System.out.println(driver.findElement(By.xpath("//th[contains(text(),'SI')]/../../tr["+i+"]/td[1]")).getText());
			System.out.println(driver.findElement(By.xpath("//th[contains(text(),'Student Name')]/../../tr["+i+"]/td[2]")).getText());
			System.out.println(driver.findElement(By.xpath("//th[contains(text(),'Role')]/../../tr["+i+"]/td[3]")).getText());
		}
		
		
		Thread.sleep(5000);
		//driver.close();
	}

}
