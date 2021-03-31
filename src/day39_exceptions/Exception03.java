package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception03 {

	public static void main(String[] args) {
		// Icice try-catch yerine  
		// 1 tane try ve multiple catch blogu kullanabilirzcak 
		// Ancak bu durumda yazdigimiz exceptionlar arasinda Parent_Child iliskisi varsa 
		// Once child classi yazmaliyiz
		// Aksi takdirde(yani once parent yazilirsa) child' da is kalmaz
		// Java erisilmez catch blogu diyerek CTE verir.
		
		
		
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\Uykusuz\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
			int k=0;
			
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
					
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


