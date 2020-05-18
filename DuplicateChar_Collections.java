package Java_Session;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateChar_Collections {

	public static void main(String[] args) {
//		Write a java program to print the duplicate character using Collections Framework.
	//	Input: "When life gives you lemons, make lemonade"
		String str = "When life gives you lemons, make lemonade";
		char[] charStr = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		/*
		 * for(int i=0; i<=ch.length-1;i++) { charSet.add(ch[i]);
		 * 
		 * }
		 */	
		for (Character eachCh : charStr) {
			if(!charSet.add(eachCh)) {
				dupCharSet.add(eachCh);
			}
		}
		for (Character each : dupCharSet) {
			if(each!=' ')
			System.out.print(each+",");
		}
		
		
		
	}

}
