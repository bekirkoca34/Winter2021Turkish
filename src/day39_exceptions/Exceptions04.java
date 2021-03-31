package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions04 {

	public static void main(String[] args) {
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\Uykusuz\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
			int k=0;
			
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
					fis.close();
				}
			} catch (FileNotFoundException e) { 
				
				e.printStackTrace();
			
			
		} catch (IOException e) {
			
			
			System.out.println(e.getMessage()); 
		}
		System.out.println("");
		System.out.println("kod bloke olmadi...");
		
		
	}

}
