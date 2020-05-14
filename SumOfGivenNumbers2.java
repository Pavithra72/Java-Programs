package Java_Session;

public class SumOfGivenNumbers2 {

	public static void main(String[] args) {

//		Write a java code to find the sum of the given numbers
//		Input: "asdf1qwer9as8d7"
//		output: 1+9+8+7 = 25
		int sum=0;
		String str ="asdf1qwer9as8d7";
		char[] ch=str.toCharArray();
		int len = ch.length;
				for(int i=0;i<=len-1;i++) {
				if(Character.isDigit(ch[i])) {
					int newsum = Character.getNumericValue(ch[i]);
					//System.out.print(newsum);
					sum=sum + newsum;
					
					
				}
				}
				System.out.println("The sum of the digits in the string is: "+sum);
			}

}
