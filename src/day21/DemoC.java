package day21;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoC {

	@Test
	public void validateTitle() {
		
		String actualTitle = "Github";
		String expectedTitle = "Github";
		
		
		/*if(expectedTitle.equals(actualTitle)) {
			System.out.println("Match success");
		}
		else {
			System.out.println("Unsucess");
		}*/
		
		System.out.println("This is where comparision begins");
		
		Assert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		
		System.out.println("This is end of the program");
		
	}
	
}
