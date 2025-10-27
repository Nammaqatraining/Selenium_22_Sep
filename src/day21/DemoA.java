package day21;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoA {

	
	
	@Test
	public void testA() {
		Reporter.log("This is a testA() method from DemoA", true);
	}
	
	@Test
	public void testB() {
		Reporter.log("This is a testB() method from DemoA", true);
	}
	
	
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout from the application",true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("Login to the application", true);
	}
	
	
	@BeforeClass
	public void openApplication() {
		Reporter.log("Open the application", true);
	}
	
	
	@AfterClass
	public void closeApplication() {
		Reporter.log("Close the application", true);
	}
	
	@BeforeTest
	public void launchBrowser() {
		Reporter.log("Launch the browser", true);
	}
	
	@AfterTest
	public void closeBrowser() {
		Reporter.log("Close the browser", true);
	}
	
	@BeforeSuite
	public void getConfig() {
		Reporter.log("Get config for suite run", true);
	}
	
	@AfterSuite
	public void closeConfig() {
		Reporter.log("close config for suite run", true);
	}
	
}
