package day22;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoB {

	@Test
	public void validateTitle() {
		
		int i =10;
		int j = 10;
		
		
		SoftAssert s1 = new SoftAssert();
		
		System.out.println("This is where comparision starts");
		
		s1.assertEquals(i, j, "Integers are not same");
		
		s1.assertNotEquals(10, 10, "Integers are same");
		
		System.out.println("This is the end of the program");
		
		
		s1.assertAll();
		
		System.out.println("This is after assert all");
	}
	
}
