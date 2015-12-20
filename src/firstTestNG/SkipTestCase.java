package firstTestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCase {

	@Test (enabled = false) //If we use it as false it doesn't show in report.
	public void skipTest(){
		System.out.println("This Test Case Should Not Execute");
		//throw new SkipException("Skip For Now"); //Skip particular test case
	}
	
	@Test (priority = 1)
	public void goodOne(){
		System.out.println("This is good to run");
	}

}
