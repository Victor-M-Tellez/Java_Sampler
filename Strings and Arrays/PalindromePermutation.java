
public class PalindromePermutation {



	public static String pal(String input){
		boolean odd1 = false;
		boolean odd2 = false;
		boolean evenLength= true;
		
		int size = input.length();
		int middle = 26;
		int symPointer;
		int alphaPointer = 0;
		
		int[] alphabet = new int[26];
		char[] symWord = new char[size];
		
		for( int x = 0 ; x < 26 ; x++){	//Set all the boxes in the alphabet array to 0
			alphabet[x]=0;
		}
		
		for( int x = 0 ; x < size ; x++){// tally up the  number of times a letter appears in the input String
			alphaPointer =  ((int) (Character.toUpperCase(input.charAt(x))))-65;
			if(alphaPointer<26 && alphaPointer >=0){
			alphabet[alphaPointer]+=1; 
			}
		}
		
		for( int x = 0 ; x < 26 ; x++){// go through the alphabet and add the letters into a new palindrome word
			if((alphabet[x]%2 == 1)&&(odd1==false)){// if we find a letter with an odd number of count
				odd1 = true;
				middle = x; //record the letter that appears an odd number of times
				evenLength= false;
			}else if((alphabet[x]%2 ==1)&& (odd2 == false)){	// if we find a second odd letter then
																		// we cant make the palindrome
				return new String("Error cant make palindrome");
			}
		}
		
		//Get rid of the middle letter
		if(evenLength != true){
			symWord[(size-1)/2] = ((char) (middle+65));
			alphabet[middle]-=1;
		}
		
		 
		symPointer= 0;
		for( int x = 0 ; x < 26 ; x++){// construct the palindrome
			
			while(alphabet[x] != 0){
				symWord[symPointer] = ((char) (x+65));
				symWord[size-1-symPointer] = ((char) (x+65));
				symPointer++;
				alphabet[x] -=2;
			}
				
				
		}
		
		System.out.printf("\nPalindrome Permutation: \n" );
		return new String(symWord);		
				
	}
			
			

	
    public static void main(String[] args) {
    	String input ="tactcoa"; 
        System.out.printf("answer:  %s", pal(input));
    }

}
