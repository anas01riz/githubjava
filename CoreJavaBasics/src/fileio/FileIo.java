package fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Trainee\\Desktop\\Anas.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Trainee\\Desktop\\Riz.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		FileReader fr = new FileReader("C:\\Users\\Trainee\\Desktop\\Anas.txt");
//		BufferedReader br = new BufferedReader(fr);
//		FileWriter fw = new FileWriter("C:\\Users\\Trainee\\Desktop\\Riz.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		
//		
//		
//		
//		String line;
//		
//		while ((line = br.readLine()) != null) {
//			System.out.println(line);
//			bw.write(line);
//			bw.newLine();
//		}
//		
	
//		br.close();
//		bw.close();
//		fr.close();
//		fw.close();
//		
		
		int val;
		//reading the files
		System.out.println(bis.read());
		while ((val=bis.read())!= -1) {
			
			System.out.println(val);
			
//		Writing the file
			System.out.println(bis.read());
			bos.write(val);
			
		}
		
//		
//		//Closing the files
//		fr.close();
//		fw.close();
//		
//		
//		int val;
//		//reading the files
//		while ((val=fis.read())!= -1) {
//			
//			System.out.println(val);
//			
//		//Writing the file
//			fos.write(val);
//		}
//		
//		
//		//Closing the files
		bis.close();
		bos.close();
		fis.close();
		fos.close();
	
//		
	}

}
