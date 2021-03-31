package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		
		/*
		 Eger kodumuzu yazdıgımızda birden fazla exception' la iliskli durum olusuyorsa
		 icice try-catch bloklari olusturabiliriz
		 Bu ornekte ilk once dosyayi okutmak istedik
		 Java " ya dosyayi bulamazsam?" diye bizden yardim istedi
		 Bizde try-catch blogu ile FileNotFoundException ile handle etmesine yardimci olduk
		 Sonra dosyadaki yazilari okumaya calistik ve Java yeniden "Ya dosyayi okuyamazsam"
		 diye yardim istedi
		 Bizde try-catch blogu ile IOException ile handle etmesini sagladik
		  
		  
		  
		 */
		
		
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\Uykusuz\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
			int k=0;
			try {
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
					
					
				}
			} catch (IOException e) { // dosyalarla ilgili genel yazma ve okuma sorunlari ile handle eder
				
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			
			
			System.out.println(e.getMessage()); 
		}
		System.out.println("");
		System.out.println("kod bloke olmadi...");
		
		

	}

	}


