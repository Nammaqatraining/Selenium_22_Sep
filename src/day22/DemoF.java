package day22;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoF {

	@Test
	public void shopping() {
			Reporter.log("Shopping", true);		
	}
	
	@Test
	public void checkOut() {
		Assert.fail();
		Reporter.log("Checkout", true);
		
	}
	
	@Test
	public void paymentGateWay() {
		
		throw new SkipException("Pay ment gateway skipped");
	}
	
	
	
}
