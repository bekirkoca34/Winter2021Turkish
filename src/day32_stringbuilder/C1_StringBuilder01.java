package day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		
		StringBuilder sb1= new StringBuilder("Rumeysa");
		System.out.println(sb1);// Rumeysa
		
		sb1.append(" ").append("cetinturk"); // verilen SB' in sonuna istedigimiz string degerlerini ekler
		System.out.println(sb1);// Rumeysa cetinturk
		
		
		String cumle="Javayi cok sever";
		sb1.append("Javayi cok sever", 6, 10);// Baska bir String'den istedigimiz bolumu SB' nin sonuna ekler
		                                      // baslangıc indexi inclusive, bitis indexi exclusive'dir
		System.out.println(sb1);    // Rumeyse cetinturk cok
		
		
		System.out.println(sb1.length());   // 21
		System.out.println(sb1.capacity()); // 23 (7 + 16)
		
		
		System.out.println(sb1.charAt(1)); // u  charAt(); indexi girilen karakteri verir
		
		sb1.charAt(5);            // Bize bilgi getiren methodlar SB' i degistirmez
		System.out.println(sb1); // Rumeysa cetinturk cok
		
		
		sb1.delete(17, 21);// String Builder i degistirdigi icin direk yazdirdik
		System.out.println(sb1);// Rumeysa cetinturk
		
		String isim="Rumeysa cetintur";
		System.out.println(sb1.equals(isim));   // false, String ile SB farklı data turlerinde oldugu icin
		                                          // icerik kıyaslamasi mumkun degil 
		
		StringBuilder sb2= new StringBuilder("Rumeysa cetintur");
		System.out.println(sb1==sb2);  // false 
		System.out.println(sb1.equals(sb2));// false SB' da equals method'u String' den farkli calisir
		                                    // ancak ayni obje ile kiyaslandiginda true verir.
		                                    // String' deki == gibi calisir
		
		System.out.println(sb1.equals(sb1));// true, kendi kendisiyle ancak true verir, biraz anlamsız, kullanisli degil
		
		System.out.println(sb1.indexOf("cetin"));// 8, indexi döndurur
		
		System.out.println(sb1.indexOf("e", 6));// 9
		
		System.out.println(sb1.indexOf("kazim"));// -1, olmadigi için -1 döndurur
		
		sb1.insert(7, " ");// istedigimiz index' den itibaren istenen String i ekler
		System.out.println(sb1);// Rum eysa cetinturkbosluk ekledi
		
		cumle="Merhaba dunya";
		sb1.insert(0, cumle, 0, 8);// SB ' a hangi index' den itibaren eklenecek
		                           // cumle: Hangi String' en eklenecek
		                           // 0: cumlenin hangi indexinden baslanacak
		                           // 8 : baslangic indexinden sonra kac karakter alinacak,
		System.out.println(sb1);// Merhaba Rumeysa cetintur
		
		System.out.println(sb1.lastIndexOf("t"));// 22 istenen String'in kullanildigi son indexi verir
		System.out.println(sb1.lastIndexOf("a", 22)); // 14 istenen indexten oncesine bakar
		
		sb1.replace(8, 15, "Seher"); // SB' in baslangıc ve bitis index'leri arasindaki kismi verilen String ile degistirir
		
	    System.out.println(sb1);// Merhaba Seher  cetinturk
	    
	    sb1.reverse();
	    System.out.println(sb1);// ters yazdirir
	    sb1.reverse();
	    
	    sb1.setCharAt(10, 'k');
	    System.out.println(sb1);// merhaba Seker cetinturk
	    
	    
	    System.out.println(sb1.subSequence(8, 13));// seker SB' in istedigimiz indexler arasindaki bolumunu verir
	    
	   
	    System.out.println(sb1.substring(8)); // Seker  cetinturk
	                                          //baslangıc index inden sona kadar
		
	    sb1.subSequence(8, 13);
	    System.out.println(sb1);
	    
	    sb1.substring(8, 13);
	    System.out.println(sb1);
	    
	    StringBuilder sb3= new StringBuilder("Java cok guzel");
	    StringBuilder sb4= new StringBuilder("Java cok guzel");
	    
	    System.out.println(sb3.equals(sb4));// false
	    // iceriklerinin esit olup olmadıgına bakmak icin String deki equals methodunu kullanalim
	    
	    System.out.println(sb3.toString().equals(sb4.toString()));// true
	    
	    sb3.toString().concat("insanin sevdikce sevesi geliyor");// String class ina ait methodlar 
	                                                             // kullaninca kalici degişiklik olmaz
	    System.out.println(sb3);
	    // toString() methodu kullaninca SB String'e donusmus olur
	    // dolaysiyla tum String methodlari kullanilabilir
	    
	    System.out.println(sb3.toString().concat(" insanin sevdikce sevesi geliyor"));
		// Java cok guzel insanin sevdikce sevesi geliyor
	    
	    System.out.println(sb1.length());// 24
	    System.out.println(sb1.capacity());// 48
	    
	    sb1.trimToSize();// SB icin hazirlanan kapasitedeki fazlaliklari siler
	                     // length() ile capacity esitler
	    System.out.println(sb1.length());// 24
	    System.out.println(sb1.capacity());// 24
	    
	    
	    sb3.compareTo(sb4);
	    System.out.println(sb3.compareTo(sb4));// 2 SB' in tum karakterlerinin estiligini kontrol eder.
	                                           // 0 ise esit.

		
		
		
	    StringBuilder sb5= new StringBuilder("hakan");
	    StringBuilder sb6= new StringBuilder("hasan");
		
	    System.out.println(sb5.compareTo(sb6));
	    
	    System.out.println("================================================================================");
	    
	    
	    StringBuilder sb= new StringBuilder();
	    sb.append("aaa").insert(1, "bb").insert(4, "ccc");
	    System.out.println(sb);    //abbaccca
		
		
		
		
		
		
		

	}

}
