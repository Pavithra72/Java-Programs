package Java_Session;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateChar_List {

	public static void main(String[] args) {
//		Write a java program to print the duplicate character using Collections Framework.
	//	Input: "When life gives you lemons, make lemonade"
		String str = "When life gives you lemons, make lemonade";

		List<Character> lst = new ArrayList<Character> ();
		for(int i=0;i< str.length();i++) {
			if(!lst.contains(str.charAt(i))) {
				lst.add(str.charAt(i));
			}
			else {
				System.out.print(str.charAt(i)+",");
			}
		}
		
		System.out.println(" ");
		
		// method 2
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			if(!set.add(str.charAt(i))) {
				System.out.print(str.charAt(i)+",");
			}
		}
	}

}
