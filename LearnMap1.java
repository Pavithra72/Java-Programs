package Java_Session;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap1 {

	public static void main(String[] args) {
		
		/*
		 * 1. Write a Java Program to print the keys and values from the Map map = {A=1,
		 * B=2, C=3, D=4, E=5} (Min 3 ways) Note: Even if you google understand what you
		 * are doing! Output A->1 B->2 C->3 D->4 E->5
		 */
		 Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		 map.put("A", 1);
		 map.put("B", 2);
		 map.put("C", 3);
		 map.put("D", 4);
		 map.put("E", 5);

		 for (Entry<String, Integer> eachEntry : map.entrySet()) {
			 System.out.println(eachEntry.getKey()+"->"+eachEntry.getValue());
			
		}
		 
	}

}
