package Java_Session;

public class FindCharTypes {

	public static void main(String[] args) {

//		Write a java program to find the number of Uppercase, lowercase, numbers and spaces in the following String.
//		Input: "1. It is Work from Home  not Work for Home"
String str ="1. It is Work from Home  not Work for Home";
int upper =0, lower = 0, num = 0, space = 0;
boolean b1, b2, b3, b4;

char[] strArray = str.toCharArray();
int strLen = strArray.length;
for (int i = 0; i < strLen; i++) 
{
	if(strArray[i] == ' ')
	{
		space = space+1;
	}
	else if(Character.isUpperCase(strArray[i]))
	{
		upper = upper+1;
	}
	else if(Character.isLowerCase(strArray[i]))
	{
		lower=lower+1;
	}
	else if(Character.isDigit(strArray[i]))
	{
		num = num+1;
	}
}

System.out.println("UpperCase: "+ upper);
System.out.println("Lower Case: " + lower);
System.out.println("Number: " + num);
System.out.println("Space: " + space);




	}

}
