package firstTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider
	public  Object[][] getData(){
		Object [][] data = new Object[3][3];
		
		data [0][0] = "Hobaib";
		data [0][1] = "12345";
		data [0][2] = "hobaib@gmail.com";
		
		data [1][0] = "Hasan";
		data [1][1] = "34532";
		data [1][2] = "hasan@gmail.com";
		
		data [2][0] = "Anik";
		data [2][1] = "67853";
		data [2][2] = "anik@gmail.com";
		
		return data;
	}
	
	@Test (dataProvider = "getData")
	public void testSignup(String frName, String sss, String email){
		System.out.println(frName + "----" + sss + "----" + email);
	}
}
