package Java_Session;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RetriveValue {

	public static void main(String[] args) {
	//	How to retrieve a value from a Set? Set = "1,2,3,4,5,6,7,8,9" retrieve and print only the value - 7
		
		Set<Character> intSet = new TreeSet<Character> (); 
	String	set = "1,2,3,4,5,6,7,8,9";
	char[] charSet = set.toCharArray();
		
	for (Character eachChar : charSet) {
		
		intSet.add(eachChar);
		
		
	}
	List<Character> lstSet = new ArrayList<Character>(intSet);
	System.out.println(lstSet.get(7));
	//System.out.println(intSet);
//	for (Character ch : intSet) {
//		if(ch.equals('7')) {
//			System.out.println(ch);
//	}
//	}

	}

}
