
public class matrixRotate {

	
	public static void print2DCharArrayInputAndOutput(char[][] in, char[][] out){
		int size = in.length;
		for(int row = 0 ; row < size ; row++){
			for(int col = 0 ; col < size ; col++){
				System.out.printf(" %c ",in[row][col]);	
			}
			System.out.printf("\t\t\t");
			for(int col = 0 ; col < size ; col++){
				System.out.printf(" %c ",out[row][col]);	
			}
			System.out.printf("\n\n");
		}	
	}
	
	
	public static void rotateClockWise(char[][] in){
		// [row][col]
		
		int size = in.length;
		char[][] out = new char[size][size];
		
		//System.out.printf("\n %d",size);
		for(int row = 0 ; row < size ; row++){
			
			for(int col = 0 ; col < size ; col++){
				out[row][col]= in[size-1-col][row];	
			}	
		}
		
		 print2DCharArrayInputAndOutput(in,out);
	}
		
		
	public static void rotateCounterClockWise(char[][] in){
		// [row][col]
		
		int size = in.length;
		char[][] out = new char[size][size];
		
		for(int row = 0 ; row < size ; row++){
			
			for(int col = 0 ; col < size ; col++){
				out[row][col]= in[col][size-1-row];	
			}	
		}
		
		 print2DCharArrayInputAndOutput(in,out);
	}
		
	
	
	
	
	
	
	
	
	
	
	
	  public static void main(String[] args) {
	    	//INPUT:	[0,2]=C			OUTPUT:
	    	//		A B C D E				K 5 F 0 A
		  	//		0 1 2 3 4				M 6 G 1 B
		  	//		F G H I J				Y 7 H 2 C
		  	//		5 6 7 8 9				L 8 I 3 D
		  	//		K M Y L X				X 9 J 4 E
	    	
	    	
		  	char[][] input = {	{'A','B','C','D','E'},
		  						{'0','1','2','3','4'},
		  						{'F','G','H','I','J'},
		  						{'5','6','7','8','9'},
		  						{'K','M','Y','L','X'}
		  					 }; 
		  	System.out.printf("INPUT\t\t\t\tClockWise Rotation\n-----\t\t\t\t------------------\n");
	        rotateClockWise(input);
	        System.out.printf("INPUT\t\t\t\tCounterClockWise Rotation\n-----\t\t\t\t-------------------------\n");
	        rotateCounterClockWise(input);
	         
	    }
}
