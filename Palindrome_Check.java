package Java_Session;

public class Palindrome_Check {

	public static void main(String[] args) {
//		Check for the palindrome of the given string: 
//			Input: "malayalam" output: Yes, Palindrome 
//			Input: "testleaf" output: No, not a palindrome
		
String str1= "malayalam";
String str2="testleaf";
String rev="";
String rev2="";
char[] str1Arr = str1.toCharArray();
char[] str2Arr = str2.toCharArray();
int str1Len = str1Arr.length;
int str2Len = str2Arr.length;
		for(int i=str1Len-1; i>=0;i--) {
			char ch =str1Arr[i];
			rev = rev + ch;
		}
		if (rev.equalsIgnoreCase(str1)) {
			System.out.println("The given string "+str1+" is Palindrome");
			}
			else {
				System.out.println("The given string "+str1+" is not a Palindrome");
		
			}
	
	for(int j=str2Len-1; j>=0;j--) {
		char ch1 =str2Arr[j];
		rev2 = rev2 + ch1;
	}
	if (rev2.equalsIgnoreCase(str2)) {
		System.out.println("The given string "+str2+" is Palindrome");
		}
		else {
			System.out.println("The given string "+str2+" is not a Palindrome");
	
		}
	
	}
}


