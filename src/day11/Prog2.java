package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/eclipse-workspace-java/SeleniumPractice/src/html/Page4.html");
		
		for(int i=2;i<=4;i++) {
			System.out.println(driver.findElement(By.xpath("//tr["+i+"]/td[2]/preceding-sibling::td")).getText());
			System.out.println(driver.findElement(By.xpath("//tr["+i+"]/td[2]")).getText());
			System.out.println(driver.findElement(By.xpath("//tr["+i+"]/td[2]/following-sibling::td")).getText());
		}
		
		Thread.sleep(5000);
		//driver.close();
	}

}
