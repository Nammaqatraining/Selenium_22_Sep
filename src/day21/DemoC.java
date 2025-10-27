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
		
		Assert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		
		
	}
	
}
