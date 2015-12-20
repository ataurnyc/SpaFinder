package firstTestNG;

public class ReadWriteExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xls_Reader data = new Xls_Reader(System.getProperty("user.dir")+"/doc/test.xlsx");
		System.out.println(data.getRowCount("test"));
	}

}
