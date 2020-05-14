package Java_Session;

public class FindCharTypes2 {

	public static void main(String[] args) {

//		Write a java program to find the number of Uppercase, lowercase, numbers and spaces in the following String.
//		Input: "1. It is Work from Home  not Work for Home"
String str ="1. It is Work from Home  not Work for Home";
String strNum = str.replaceAll("[^0-9]", "");
int num = strNum.length();
System.out.println("The count of numbers in string is:" + num );
String strUpper = str.replaceAll("[A-Z]", "");
int upper = strUpper.length();
System.out.println("The count of Uppercase letters in string is:" +(str.length()- upper) );
String strLower = str.replaceAll("[a-z]", "");
int lower = strLower.length();
System.out.println("The count of Lowercase letters in string is:" +(str.length()- lower));
String strSpace = str.replaceAll(" ", "");
int space = strSpace.length();
System.out.println("The count of space  in string is:" + (str.length()-space) );


	}

}
