package goose;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q2 {

	 //FileOutputStream output = new FileOutputStream("temp.dat")
	public static void main(String[] args) throws IOException {

		File file = new File("Exercise17_02.dat");
		if (file.exists()) {
		}else {
			file.createNewFile();
		}
		try (
				FileOutputStream wrt = new FileOutputStream(file.getAbsoluteFile(), true);
				BufferedOutputStream out = new BufferedOutputStream(wrt);
				FileInputStream read = new FileInputStream(file.getAbsoluteFile());
				BufferedInputStream in = new BufferedInputStream(read);
				){
			
			for(int i =0; i<100;i++) {
				int x = 1 + (int)(Math.random() * ((99) + 1));
				byte[] bytes = new byte[4];
				for (int j = 0; j < 4; j++) {
				    bytes[j] = (byte)(x >>> (j * 8));
				}
				out.write(bytes);
			}
		
		} 

	}
	
	
	
	
	
	
}
