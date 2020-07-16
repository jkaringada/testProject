package testProject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String someFile="jeff.txt";

		FileInputStream localFileInputStream = null;
		try {
			localFileInputStream = new FileInputStream(someFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStreamReader localInputStreamReader = new InputStreamReader(localFileInputStream);
		BufferedReader reader = new BufferedReader(localInputStreamReader);
		
		 String line = null;
		    while((line = reader.readLine()) != null) {
		      String formattedLine = (line);
		      // do other stuff
		    }
	}

}
