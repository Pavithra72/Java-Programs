package Java_Session;

public class ReverseEvenWordsInSentence {

	public static void main(String[] args) {
//		Write a java program to do the following.
//		Input: "When the world realise its own mistake, corona will dissolve automatically"
//		output: "When eht world esilaer its nwo mistake, anoroc will evlossid automatically"

		String str ="When the world realise its own mistake, corona will dissolve automatically";
		String[] splitWord=str.split(" ");
		//System.out.println(split[3]);
		int len=splitWord.length;
		for(int i=0;i<=len-1;i++) {
			//System.out.println(splitWord[i]);
			//System.out.println(i);
			
			if(i%2==0) {
				System.out.print(splitWord[i]+ " ");
			}
				
				if (i%2!=0) {
				//	String word = splitWord[i];
					int length= splitWord[i].length();
				
			//	String word = splitWord[i];
				//int length= word.length();
		for(int j=length-1; j>=0; j--) {
				
				System.out.print(splitWord[i].charAt(j)+ "");
				System.out.print("");
			
		}
		}
		}
	


		
	}

}
