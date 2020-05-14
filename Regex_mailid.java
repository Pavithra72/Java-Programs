package Java_Session;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_mailid {

	public static void main(String[] args) {
//		Write a java program to verify whether the given String is valid email address.
//		Input: "balaji.chandrasekaran@testleaf.com"
//		output: true
//		Input: "balaji.c@tunatap.co.uk"
//		output: true
//		Input: "naveen e@tl.com"
//		output: false
//		Note: Spl characters like . _ are only allowed
		List<String> emails = new ArrayList<String>();
		emails.add("balaji.chandrasekaran@testleaf.com");
		emails.add("balaji.c@tunatap.co.uk");
		emails.add("naveen e@tl.com");
		
		 
				String regex = "[A-Za-z0-9+_.-]+@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String email : emails){
		    Matcher matcher = pattern.matcher(email);
		    System.out.println(email +" : "+ matcher.matches());
		}		
		
		
	}

}
