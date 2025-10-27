package day21;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends DemoA{

	@Test
	public void testC() {
		Reporter.log("This is a testC() method from DemoB", true);
	}
	
}
