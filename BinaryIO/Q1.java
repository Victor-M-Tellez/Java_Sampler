package goose;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {
	
	public static void main(String[] args) {

		BufferedWriter buff = null;
		FileWriter wrt = null;

		try {
			File file = new File("Exercise17_01.txt");
			if (file.exists()) {
				
			}else {
				file.createNewFile();
			}
			wrt = new FileWriter(file.getAbsoluteFile(), true);
			buff = new BufferedWriter(wrt);
			
			for(int i =0; i<100;i++) {
				int x = 1 + (int)(Math.random() * ((99) + 1));
				buff.write(x+" ");
				buff.newLine();
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (buff != null) {
					buff.close();
				}
				if (wrt != null) {
					wrt.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
	
}
