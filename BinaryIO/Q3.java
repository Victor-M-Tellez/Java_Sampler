package goose;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Q3 {

	
	  public static void main(String[] args) throws IOException {
		    ObjectOutputStream output =  new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"));
		    int[] x= {1,2,3,4,5};
		    java.util.Date currentTime=new java.util.Date();
		    output.writeInt(x[0]);
		    output.writeInt(x[1]);
		    output.writeInt(x[2]);
		    output.writeInt(x[3]);
		    output.writeInt(x[4]);
		    output.writeObject(currentTime);
		    output.writeDouble(5.5);
		    output.close();
		  }
	
}
