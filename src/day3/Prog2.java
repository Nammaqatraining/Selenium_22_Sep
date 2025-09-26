package day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Dimension dim = new Dimension(500, 900);
		driver.manage().window().setSize(dim);
		
		Thread.sleep(5000);
		
		Point point = new Point(400, 300);
		driver.manage().window().setPosition(point);
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
