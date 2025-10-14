package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scores/117362/ind-vs-wi-2nd-test-west-indies-tour-of-india-2025");
		
		/*System.out.println(driver.findElement(By.xpath("//div[@ng-repeat='batsmen in match.miniscore.batsman']//a[text()='KL Rahul']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@ng-repeat='batsmen in match.miniscore.batsman']/div/a[text()='KL Rahul']/../../div[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@ng-repeat='batsmen in match.miniscore.batsman']/div/a[text()='KL Rahul']/../../div[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@ng-repeat='batsmen in match.miniscore.batsman']/div/a[text()='KL Rahul']/../../div[4]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@ng-repeat='batsmen in match.miniscore.batsman']/div/a[text()='KL Rahul']/../../div[5]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@ng-repeat='batsmen in match.miniscore.batsman']/div/a[text()='KL Rahul']/../../div[6]")).getText());
		*/
		//WebElement klRahul = driver.findElement(By.xpath("//div[@ng-repeat='batsmen in match.miniscore.batsman']//a[text()='KL Rahul']"));
		WebElement klRahul = driver.findElement(By.xpath("(//a[text()='KL Rahul'])[1]"));
		
		System.out.println(klRahul.getText());
		
		for(int i=2;i<=6;i++) {
			System.out.println(driver.findElement(By.xpath("//div[@ng-repeat='batsmen in match.miniscore.batsman']/div/a[text()='KL Rahul']/../../div["+i+"]")).getText());
		}
		

		Thread.sleep(5000);
		//driver.close();
	}

}
