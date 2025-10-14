package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scores/117362/ind-vs-wi-2nd-test-west-indies-tour-of-india-2025");
		
		
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		
		System.out.println("Number of images present in the web page is "+images.size());
		

	}

}
