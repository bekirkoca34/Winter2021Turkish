package day11_stringmanupilations;

public class C2_CharAt {

	public static void main(String[] args) {
		// // CharAt(index)
		// scan.next().charAt(0) 0. indexdeki karakteri verir
		// index 0' dan baslar
		
		
		
		String str="Java cok guzel";
		System.out.println(str.charAt(0));// J
		
		System.out.println(str.charAt(5));// c
		
		System.out.println(str.charAt(13));// l
		// kelimenin uzunlugu son index + 1
		// son index kelimenin uzunlugu -1
		// kullanici 10 karakterli bir kelime girerse abcd efghı
		// bana son harfi veren kodu yazın
		// str.charAt(9)
		
        
		 System.out.println(str.charAt(15)); // exception verir
		// eger inex olrak String in uzunlugu veya daha buyuk bir sayi girilirse
		
		// String str3=5;// Compile Time Error, CTE
		              // kod calismadan Java'nin farkina varip altini kirmizi cizdigi hatalardir.
		              // bu tur hatalar duzeltilmeden java kodu calistirmaz.
		
		 
		 // System.out.println(str.charAt(15)); bazi hatalar syntax' den anlasilmaz,
		                          // ancak kod calistirildiktan sonra Java islemi yaparken anlasilir
		                          // kod Run edildiginde ortaya ciktigi icin bu tur hatalara
		                          // Run Time Error denir. RTE

	}

}
