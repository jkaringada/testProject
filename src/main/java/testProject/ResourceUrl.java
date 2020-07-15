package testProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class ResourceUrl {
	
	public void TestUrl() throws MalformedURLException, IOException {
		String str = "";
	    URLConnection conn 
	      = new URL("http://norvig.com/big.txt").openConnection();
	    BufferedReader br = new BufferedReader(
	      new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
	    
	    while (br.readLine() != null) {
	        str += br.readLine();
	    } 
	}

}
