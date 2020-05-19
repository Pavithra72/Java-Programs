package Java_Session;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		//How to remove duplicates from a list?  List = "A,B,C,D,A,D,E,F"
		
		String lst= "ABCDADEF";
		char[] ch = lst.toCharArray();
		
		
		List<Character> oriLst= new ArrayList<Character>();
	
		for (Character character : ch) {
			oriLst.add(character);
			
		}
		Set<Character> dupLst = new LinkedHashSet<Character>(oriLst);
		//System.out.println(dupLst);
				
for (Character eachChar : dupLst) {
	if(eachChar!= ' ') {
		System.out.print(eachChar);
	}
}
	}

}
