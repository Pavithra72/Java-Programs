package Java_Session;

public class Palindrome_Check2 {

	public static void main(String[] args) {
//		Check for the palindrome of the given string: 
//			Input: "malayalam" output: Yes, Palindrome 
//			Input: "testleaf" output: No, not a palindrome
		// method 2
		String myString = "malayalam";
	      StringBuffer buffer = new StringBuffer(myString);
	      buffer.reverse();
	      String data = buffer.toString();
	      if(myString.equals(data)){
	         System.out.println("Given String is palindrome");
	      }else{
	         System.out.println("Given String is not palindrome");
	      }
	
	}
}


