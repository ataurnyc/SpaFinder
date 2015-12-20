package firstTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotation {

	@BeforeTest
	//Things need to assign before Test Case running
	//db connection
	public void bdConnection(){
		System.out.println("Database Connected");
	}
	@AfterTest
	//Things need to assign after Test Case running
	//db connection close
	public void bdClose(){
		System.out.println("Database Connection Closed");
	}
	
	@BeforeMethod
	//It is called before every single test case run.
	
	public void openBrowser(){
		System.out.println("Open Browser");
	}
	
	
	@Test (enabled = true)
	public void loginTest(){
		System.out.println("First Test NG test");
	}
	
	@Test
	public void logOutTest(){
		System.out.println("Log out test");
	}
	
}
