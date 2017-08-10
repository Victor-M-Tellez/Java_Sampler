
public class OneAway {

	public static boolean oneAway( String w1, String w2){
		int size = w1.length();
		
		boolean ins = ( w2.length() == size+1 );
		boolean del = ( w2.length() == size-1 );
		boolean rep = ( w2.length() == size );
		
		
		if((del || ins || rep) != true){	//if the size of the 2 words isnt 1 away then it cant be 1 away
			return false;
		}else {
			
			if( rep == true){
				int buffer = 2;
				for ( int x = 0 ; x < size ; x++){
					if(w1.charAt(x) != w2.charAt(x)){
						buffer -= 1;
						if(buffer == 0) 
							return false;
					}
				}
				
			} else if((ins == true) || (del == true)){
				if(ins == true){
					String wordHolder = w1;
					w1 = w2;
					w2 = wordHolder;
				} 
				String big = w1;
				String small = w2;
				int pSmall = 0;
				int buffer = 2;
				
				for(int x=0; x < big.length(); x++, pSmall++ ){
					
					if( x == (small.length()-1) && (buffer == 2)){
						return true;
					}else if ( big.charAt(x) != small.charAt(pSmall)){
						buffer -= 1;
						if( buffer == 0){
							return false;
						}
						pSmall -= 1;
					}

				}
				
			}	
				
		}
		return true;
	}
	

    public static void main(String[] args) {
    	//WORD1			WORD2		ANSWER
    	//pale			ple			T
    	//pales			pale		T
    	//pale			bale		T
    	//pale			bake		F		
    	String word1 = "pale";
    	String word2 = "bale";
        System.out.printf("answer:  %b", oneAway(word1,word2));
    }

}
