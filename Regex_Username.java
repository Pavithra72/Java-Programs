package Java_Session;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Username {

	public static void main(String[] args) {
//		Write a java program to validate the given username is valid or not
//		Input: "Balaji1"
//		output: false
//		Input: "Testleaf$123"
//		output: false
//		Note: 
//		1. It should contain minimum 8 characters.
//		2. It allows alpha numeric characters and spl characters like . _ @ $

		
		
		List<String> username = new ArrayList<String>();
		username.add("Balaji1");
		username.add("Testleaf$123");
		
		
		 
				String regex = "[a-zA-Z0-9._@$]{8,16}";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String uName : username){
		    Matcher matcher = pattern.matcher(uName);
		    System.out.println(uName +" : "+ matcher.matches());
		}		
		
		
	}

}
