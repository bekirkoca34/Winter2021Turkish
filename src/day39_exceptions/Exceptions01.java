package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		// Java' ya bir dosya okumasini yada yazmasini soyledigimizde
		// Java' "ya dosyayi bulamazsam" der ve bizden cozum uretmemizi bekler
		// Dosya bulma ile ilgili exception turu : FileNotFoundException
		// Java kodu yazar yazmaz burdaki olasi problemi gorur ve CTE verir
		// Kodumuzu yazdigimiz anda ortaya cikan bu tur exception'lara "Checked Exceptions" denir.
		
		
		
		
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\Uykusuz\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();// Tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz.
			System.out.println(e.getMessage()); // daha az hata aciklamasi yazdirir
		}
		System.out.println("kod bloke olmadi...");

	}

}
