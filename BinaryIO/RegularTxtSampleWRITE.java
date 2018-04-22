package goose;

public class RegularTxtSampleWRITE {

	
	public static void main(String[] args) throws java.io.IOException {
	    java.io.File file = new java.io.File("scores.txt");
	    
	    if (file.exists()) {
	      System.out.println("File already exists");
	      System.exit(0);
	    }
	    //FileOutputStream output = new FileOutputStream("temp.dat")
	    try(java.io.PrintWriter output = new java.io.PrintWriter(file)){//create file
	    	output.print("John T Smith ");
	 	    output.println(90);
	 	    output.print("Eric K Jones ");
	 	    output.println(85);
	    }

	
	  }
	
	
}
