package day22;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoE {

	@Test
	public void shopping() {
		
		Reporter.log("Shopping", true);
		Assert.fail();
		
	}
	
	@Test(dependsOnMethods = "shopping")
	public void checkOut() {
		
		Reporter.log("Checkout", true);
		
	}
	
	
}
