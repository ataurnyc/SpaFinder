package learnLogs;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LearningLog4J {
	public static Logger APPLICATION_LOGS = Logger.getLogger("rootLogger"); 
	//rootLogger is like a keyword
	@Test
	public void test1(){
		System.out.println("This is 1st Method");
		APPLICATION_LOGS.debug("This is log test");
	}
	
	@Test
	public void test2(){
		System.out.println("This is 2nd Method");
	}
	

	@Test
	public void test3(){
		System.out.println("This is 3rd Method");
	}
}