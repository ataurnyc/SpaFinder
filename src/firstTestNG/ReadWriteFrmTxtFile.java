package firstTestNG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFrmTxtFile {
	
	public static void main(String []args)throws IOException{
		File f = new File ("C:\\Users\\ataurcse\\Desktop\\test.txt");
		f.createNewFile();
		
		FileWriter write = new FileWriter("C:\\Users\\ataurcse\\Desktop\\test.txt");
		BufferedWriter out = new BufferedWriter(write);
		
		out.write("Hello!!! QA Circle Students!");
		out.newLine();
		out.write("Line 1");
		out.newLine();
		out.write("Line 2");
		
		out.flush();
		
		FileReader read = new FileReader("C:\\Users\\ataurcse\\Desktop\\test.txt");
		BufferedReader readNow = new BufferedReader(read);
		//System.out.println(readNow.readLine());
		
        String line;

        // Read file line by line and print on the console
        while ((line = readNow.readLine()) != null)   {
          System.out.println(line);
        }
	}
	
}
