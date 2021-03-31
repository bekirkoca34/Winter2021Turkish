package day11_stringmanupilations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.toLowerCase()verilen String'in tamamini kucuk harfe cevir.
		// str.toUpperCase() verilen String 'in tamamini buyuk harfe cevirir.
		
		String str = "Techproeducation";
		
		// buyuk harf ile yazdirmak istersek
		System.out.println(str.toUpperCase());
		
		//str' i buyuk harfe cevirmek istersek,
		
		str=str.toUpperCase();// bu satırdan sonra kalici olarak str BUYUK harflerden olusan bir String oldu
	
		System.out.println(str);
		
	   System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));//yerel diller icin kullanilir
	   
	   
	   
		
		
		

		
		
		
		
		
		
		
	}

}
