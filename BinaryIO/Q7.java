package goose;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Q7 {
	
	  public static void main(String[] args)throws ClassNotFoundException, IOException {

		  
		  Scanner sc=new Scanner(System.in);  
			
		  	System.out.println("Enter the name of the File you want to be displayed in hex:");
			String in = sc.nextLine();
			//String input = "score.dat";
				File inp = new File(in);
				if (inp.exists()) {
				}else {
					System.out.println("File does not exist therefore cannot be displayed in hex");
					System.exit(1);
				}
			    ObjectInputStream input = new ObjectInputStream(new FileInputStream(inp.getAbsoluteFile()));
			    int r;
			    try{
			    while((r=input.readInt())!=-1) {
			    	String str = String.valueOf(r);
			    	 char[] chars = str.toCharArray();
			    	    StringBuffer hex = new StringBuffer();
			    	    for (int i = 0; i < chars.length; i++)
			    	    {
			    	        hex.append(Integer.toHexString((int) chars[i]));
			    	    }
			    	    
			    	 System.out.print(" "+hex.toString());
			    	
			    }
			    }catch(java.io.EOFException x) {
			    	
			    }
			    input.close();
	}
	
	
	
	
	
	
	
	
	
	
}
