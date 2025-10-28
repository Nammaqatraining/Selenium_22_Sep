package day22;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoA {

	@Test
	public void validateTitle() {
		
		int i =10;
		int j = 10;
		
		
		//Assert.assertEquals(i, j, "Integers are not same");
		
		//Assert.assertNotEquals(i, j, "Integers are same");
		
		//Assert.assertTrue(false);
		
		//Assert.assertFalse(true);
		
		String s1 = new String();
		//s1 = null;
		s1 = "India";
		//Assert.assertNull(s1);
		Assert.assertNotNull(s1);
	}
	
}
