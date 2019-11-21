package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Trainee\\Desktop\\Anas.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Trainee\\Desktop\\Riz.txt");
		
		
		int val;
		//reading the files
		while ((val=fis.read())!= -1) {
			
			System.out.println(val);
			
		//Writing the file
			fos.write(val);
		}
		
		
		//Closing the files
		fis.close();
		fos.close();
		
	}

}
