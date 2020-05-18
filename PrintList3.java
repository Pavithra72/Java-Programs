package Java_Session;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintList3 {

	public static void main(String[] args) {

	//	Write a java program to print the list (Need 3 different answers)
	//	Input: [B,u,g,a,t,t,i, ,C,h,i,r,o,n]

		String str = "Bugatti Chiron";
		
		List<Character> values = new ArrayList<Character> ();
		
		for(int i=0;i< str.length();i++) {
			values.add(str.charAt(i));
		}
		//For each output
		System.out.println("For each output");
		for (Character eachValue : values) {
			System.out.print(eachValue);
		}	
		
			}

}
