package Java_Session;

import java.util.ArrayList;
import java.util.List;

public class PrintList1 {

	public static void main(String[] args) {

	//	Write a java program to print the list (Need 3 different answers)
	//	Input: [B,u,g,a,t,t,i, ,C,h,i,r,o,n]

		List<Character> values = new ArrayList<Character> ();
		values.add('B');
		values.add('u');
		values.add('g');
		values.add('a');
		values.add('t');
		values.add('t');
		values.add('i');
		values.add(' ');
		values.add('C');
		values.add('h');
		values.add('i');
		values.add('r');
		values.add('o');
		values.add('n');
		for (Character character : values) {
			System.out.print(character);

		}
		//System.out.println(values);
		
	}

}
