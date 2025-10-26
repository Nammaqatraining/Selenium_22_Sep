package day20;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {


	@Test(priority = 0, invocationCount = 1)
	public void testB() {
		Reporter.log("Executing testB() from DemoA",true);
	}
	
	
	@Test(priority = 1)
	public void testA() {
		Reporter.log("Executing testA() from DemoA",true);
	}
	
	
}
