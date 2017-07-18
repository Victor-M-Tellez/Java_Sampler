import java.util.Scanner;
/**
* SUMMARY:		An algorithm that determines if a string has all unique characters.
* 					IsUniqueA)Using data structure (array)
* 					IsUniqueB)Without using additional data structures 
* 
* INPUT:		A string
* 
* OUTPUT:		Boolean
* 
* EXAMPLE:		
* #1		Input:	"cat"
* 			Output:	true
* 
* #2		Input:	"hello"
* 			Output:	false
* 
* 				
*  
* @version 1.0
* @author Victor Tellez
* 
**/
public class IsUnique {
	
	
	public static boolean isUniqueA(String input){
		
		//This finds and stores the length of the inputed string
		int sizeOfInput= input.length();	 
		
		//This will store the ascii decimal number of the specific character,
		//that we will be looking at as we move through all the letters 
		//in the input string
		int pointer;				
		
		//This array is 91 spaces long because the alphabet in ascii
		//fits in 91 spaces. For example 'A' is 65 in ascii and 
		//'Z' is 90 in ascii so our array needs to be 91 spaces long.
		boolean[] letterUsed= new boolean[92];	
		
		//We then set all the values to 'false'. This is so that when
		//we look up a value we can check if that letter has been used.
		//If is has not been used then we will find a boolean value of 'false'
		for (int d=0; d<92; d++){	
			letterUsed[d]=false;
		}
		
		//We then traverse the inputed string and check the letterUsed array
		//as we move across the string. If we check the letterUsed array and find
		//a value of 'false' we change the value to 'true' since we have now found
		//an occurrence of the letter. If we find a 'true' value in the letterUsed 
		//array then we return 'false' since we have found a letter twice.
		for(int e=0; e<sizeOfInput; e++){
			pointer = (int) Character.toUpperCase(input.charAt(e));
			if(letterUsed[pointer]==true){
				return false;
			}else{
				letterUsed[pointer]=true;
			}
		}
		
		//We have successfully traversed the string inputed and have not
		//found any repeating letters therefore we return 'true'
		return true;
	}
	
	
	
	
	public static boolean isUniqueB(String input){
		
		
		//This finds and stores the length of the inputed string
		int sizeOfInput= input.length();
		
		//This will store the specific character, that we will be looking 
		//at as we move through all the letters in the input string
		char pointer;
	
		//In the outer array we will traverse the array and set the 'pointer'
		//to a specific character of the input string
		for(int a =0; a<sizeOfInput; a++){
			
			//We make sure to convert all the letters to the same Case since
			//Upper and Lower cases will not be seen as equal by the computer
			//but we count them as the same letter regardless of Casing
			pointer= Character.toLowerCase(input.charAt(a));
			
			//In the inner array we take the character that is in the 'pointer'
			//and compare it to the rest of the rest of the inputed string
			//If the pointer equals another letter in the string then 
			//'false' is returned for we have found at one duplicate letter
			for(int b =a+1; b<sizeOfInput; b++){		
				if(pointer==Character.toLowerCase(input.charAt(b))){
					return false;
				}
			}
		}
		
		//We have successfully traversed the string inputed and have not
		//found any repeating letters therefore we return 'true'
		return true;
	}
	
	
	
	
	
	public static void main(String[] args){
		String input= "qwertyuioplkjhgfdsamnbvcxzz";
		boolean answer= isUniqueA(input);
		System.out.println(answer);
	}
}
