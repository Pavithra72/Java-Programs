package Java_Session;

public class Occurence_of_Character {

	public static void main(String[] args) {
//		Write a Java Program to find the occurance of the character 'o' in the following String. 
//		Input: "You have no choice other than following me!" output: Occurance of o is: 6
		
		String input = "You have no choice other than following me!";
		System.out.println("The given string is :" + input);
		int s = 0;

		char[] inputArray = input.toCharArray();
		int inputLen = inputArray.length;
		for (int i = 0; i <= inputLen - 1; i++) {
			if (inputArray[i] == 'o') {
				s = s + 1;
				// System.out.println(s);

			}
		}

		System.out.println("The number of occurence of character o is :" + s);

	}

}
