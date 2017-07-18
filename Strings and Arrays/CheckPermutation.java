import java.util.Scanner;
/**
* SUMMARY:	This method can figure out if a specific String is a permutation of another
* 
* INPUT:	2 Strings	
* 
* OUTPUT:	Boolean
* 
* EXAMPLE:		"ABC"	has the following permutations: "CAB"	"BCA"	"CBA"	"BAC"	"ACB"
* 
* #1		Input:	"ABC"	,	"BCA"
* 			Output:	true
* 
* #2		Input:	"ABC"	,	"CAT"
* 			Output:	false
* 			
*  
* @version 1.0
* @author Victor Tellez
* 
**/
public class CheckPermutation {

	public static boolean permutationChecker(String input1, String input2){
		
		//We create an array that will keep track of the frequency a letter 
		//appears in a word. This is why it is 26 boxes long
		int[] alphabetKey = new int[26];
		
		//We check to see that the length of the words match up before doing
		//any more coding
		int lenght1 = input1.length();
		int lenght2 = input2.length();
		if(lenght1!=lenght2){
			return false;
		}
		
		//We clear the array and make sure all the boxes start with a 0
		for(int a=0; a<26; a++){
			alphabetKey[a]=0;
		}
		
		//We increment by one for every letter we encounter in the specific box
		//that it corresponds in. For example A in ascii is 65 since we subtract 65
		//from every entry A can be found in the 0th location in the array. ALso
		//We made sure to change all the letters to UpperCase in order to avoid
		//Any confusion with the lower case letters.
		for(int a=0; a<lenght1; a++){
			
			//For every letter in input1 we increment the array location by 1
			alphabetKey[ (int) Character.toUpperCase(input1.charAt(a))-65]+=1;
			//For every letter in input1 we decrement the array location by 1
			alphabetKey[ (int) Character.toUpperCase(input2.charAt(a))-65]-=1;
		}
		
		//We finally check to see if the letters in each string appear at the same rates
		//We do this by checking that every box in the array is 0 since the strings
		//should have canceled out. If a box contains a number other than 0 return false
		for(int a=0; a<26; a++){
			if(alphabetKey[a]!=0){
				return false;
			}
		}
		
	//The strings are permutations of each other
	return true;	
	}
	
	
	
	public static void main(String[] args){
		String input1= "abc";
		String input2= "bca";
		boolean answer= permutationChecker(input1,input2);
		System.out.println(answer);
	}
}
