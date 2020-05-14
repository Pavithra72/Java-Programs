package Java_Session;

public class SumOfGivenNumbers {

	public static void main(String[] args) {

//		Write a java code to find the sum of the given numbers
//		Input: "asdf1qwer9as8d7"
//		output: 1+9+8+7 = 25
		int sum=0;
		String str ="asdf1qwer9as8d7";
		String replacedStr = str.replaceAll("[^0-9]", "");
		char[] strArray = replacedStr.toCharArray();
		int strLen = strArray.length;
		for(int i=0; i<=strLen-1;i++) {
			int newsum1 = Character.getNumericValue(strArray[i]);
			sum=sum+newsum1;
		}
		System.out.println("The sum of the digits in the string is: "+sum);

	}

}
