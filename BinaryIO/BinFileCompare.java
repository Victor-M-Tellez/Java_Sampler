package goose;

import java.util.Scanner;

public class compare {
	public static void main(String[] args) throws java.io.IOException {
		  // Create a File instance
	    //java.io.File file = new java.io.File("C:\\Users\\Victor\\Desktop\\scores.txt");
	    //java.io.File file2 = new java.io.File("C:\\Users\\Victor\\Desktop\\scores2.txt");
		java.io.File file = new java.io.File("C:\\Users\\Victor\\Downloads\\AA.txt");
		java.io.File file2 = new java.io.File("C:\\Users\\Victor\\Downloads\\AB.txt");
	    // Create a Scanner for the file
	    Scanner input = new Scanner(file);
	    Scanner input2 = new Scanner(file2);
	    //String[] bite= new String[4];
	    String x;
	    String y;
	    int count=0;
	    // Read data from a file
	    
	    
	    while (input.hasNext() || input2.hasNext()) {
	    	if(!(input.hasNext())) {
	    		System.out.println("RAN out of inputs for file1: "+count);
	    	}
	    	if(!(input2.hasNext())) {
	    		System.out.println("RAN out of inputs for file2: "+count);
	    	}
	    	count++;
	  
	    	x = input.next();
	    	y = input2.next();
	    	if(x.equals(y)) {
	    		System.out.println("Count: "+count);
	    	}else {
	    		System.out.println("Error: "+x+" ; "+y+"; count: "+count);
	    	}
	    	
	    	
	    }
	    

	    // Close the file
	    input.close();
	    input2.close();
	}
}
