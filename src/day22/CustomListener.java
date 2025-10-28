package day22;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener implements ITestListener{

	  public void onTestStart(ITestResult result) {
		    // not implemented
		  }

		  public void onTestSuccess(ITestResult result) {
		    // not implemented
			  Reporter.log("Test case passed", true);	
		  }


		  public void onTestFailure(ITestResult result) {
		    // not implemented
			  Reporter.log("Test case failed", true);	
		  }


		  public void onTestSkipped(ITestResult result) {
		    // not implemented
			  Reporter.log("Test case skipped", true);	
		  }


		  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  }


		  public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }


		  public void onStart(ITestContext context) {
		    // not implemented
		  }

	
		  public void onFinish(ITestContext context) {
		    // not implemented
		  }
}
