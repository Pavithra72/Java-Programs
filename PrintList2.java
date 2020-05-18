package Java_Session;

import java.util.ArrayList;
import java.util.List;

public class PrintList2 {

	public static void main(String[] args) {

	//	Write a java program to print the list (Need 3 different answers)
	//	Input: [B,u,g,a,t,t,i, ,C,h,i,r,o,n]

		String str = "Bugatti Chiron";
		
		List<Character> values = new ArrayList<Character> ();
		
		for(int i=0;i< str.length();i++) {
			values.add(str.charAt(i));
		}
		
		for (int i = 0; i < values.size(); i++) {
			System.out.print(values.get(i));
		}		
	}

}
