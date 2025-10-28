package day22;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoC {

	@Test
	public void validateTitle() {
		
		String s1 = new String();
		s1 = null;
		
		String s2 = new String();
		s2 = "India";
		
		
		SoftAssert soft = new SoftAssert();
		
		System.out.println("This is where comparision starts");
		
		soft.assertNotNull(s1, "not found null");
		
		soft.assertNull(s2, "found null");
		
		System.out.println("This is the end of the program");
		
		
		soft.assertAll();
		
		System.out.println("This is after assert all");
	}
	
}
