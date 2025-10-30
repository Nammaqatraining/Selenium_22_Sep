package day22;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class DemoF {

	@Parameters({"browser","url"})
	@Test
	public void shopping(String browserName, String url) {
		
		Reporter.log("browserName "+browserName, true);	
		Reporter.log("url "+url, true);	
		Reporter.log("Shopping", true);		
	}
	
	@Parameters({"userName","pwd"})
	@Test
	public void checkOut(String userName, String pwd) {
		Reporter.log("User Name "+userName, true);
		Reporter.log("Password "+pwd, true);
		Assert.fail();
		Reporter.log("Checkout", true);
		
	}
	
	@Test
	public void paymentGateWay() {
		
		throw new SkipException("Pay ment gateway skipped");
	}
	
	
	
}
