import java.util.Scanner;
/**
* SUMMARY:	This method replaces all the spaces in a string with ‘%20’.
* 
* INPUT:	 A string(using a character array) and the “true” length of the string	
* 
* OUTPUT:	Boolean
* 
* ASSUMPTIONS: 
* 				A)there is sufficient space at the end to hold the additional characters
* 				B)you are given the “true” length of the string
* 
* EXAMPLE:		
*		 #1		Input:		“Mr John Smith   ”, 13
* 				Output:		“Mr%20John%20Smith”
* 			
* 
* @version 1.0
* @author Victor Tellez
* 
**/
public class URLify {

	
	
	public static String URLifier(String sentence, int size){
		
		//This is the string we will be replacing the spaces with
		String fill="%20";
		
		//We initialize the URL string with the first letter from the 
		//inputed string
		char starter =sentence.charAt(0);
		String URL= Character.toString(starter);
		
		//Traverse the inputed string and every time you encounter a space
		//you swap it out with a %20. We can tell that it is a space because
		//we convert everything into an int and we look to the ascii int for
		//space which is 32.
		for(int a=1; a<size; a++){
			if((int)sentence.charAt(a)!=32){
				URL+=sentence.charAt(a);
			}else{
				URL+=fill;
			}
		}
		
		return URL;
	}
	
	
	
	public static void main(String[] args){
		String input1= "Mr John Smith   ";
		int	   input2= 13;
		
		String answer= URLifier(input1,input2);
		System.out.println(answer);
	}
}