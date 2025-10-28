package day22;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoD {

	@Test
	public void validateTitle() {
		
		boolean a = true;
		boolean b = false;
		
		
		SoftAssert s1 = new SoftAssert();
		
		System.out.println("This is where comparision starts");
		
		s1.assertTrue(b, "not found true");
		
		s1.assertFalse(a, "not found false");
		
		System.out.println("This is the end of the program");
		
		
		s1.assertAll();
		
		System.out.println("This is after assert all");
	}
	
}
