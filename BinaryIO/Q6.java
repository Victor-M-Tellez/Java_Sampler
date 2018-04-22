package goose;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q6 {


	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);  
		
		System.out.println("Enter the name of the File you want to Decrypt(includign the .dat extension):");
		String input = sc.nextLine();
		//String input = "score.dat";
		System.out.println("What should be the name of the new un encrypted File:");
		String output = sc.nextLine();
		//String output = "scorEncrip.dat";
		
		
		File fileIn = new File(input);
		File fileOut = new File(output);
		if (!(fileOut.exists())) {
			fileOut.createNewFile();
		}
		
		if (fileIn.exists()) {
		}else {
			System.out.println("File does not exist therefore cannot be Decrypted");
			System.exit(1);
		}
		try (
				FileOutputStream wrt = new FileOutputStream(fileOut.getAbsoluteFile());
				BufferedOutputStream out = new BufferedOutputStream(wrt);
				FileInputStream read = new FileInputStream(fileIn.getAbsoluteFile());
				BufferedInputStream in = new BufferedInputStream(read);
				){
			int r= 0;
			while((r=in.read())!=-1) {
				r-=5;
				out.write((byte)r);
			}
		
		} 

	}
	
	
}
