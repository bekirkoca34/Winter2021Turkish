package day05_wrapper;

public class C2_WrapperClass {

	public static void main(String[] args) {
		// java da 2 tur data turu vardı
		//primitive sadece value icerir
		// non-primitive data ve  methodları iceriyordu.
		
		
		
	String isim="mehmet";
	System.out.println(isim.toUpperCase());
	
	
	//Wrapper Class : javanın primiti data türleri ile bazı metdotları 
	//kullanabilmemiz icin olusturduğu Class'lardır.
	
	// boolean, char, byte, short, int, long, float, double
	
	byte sayi=10;
	
	Byte sayi2=11;// ismen primitive data ile aynı olan non-primitive datalara 
	               //Wrapper denir.
	
	System.out.println(sayi2);
	
	Byte byteMinSayi = Byte.MIN_VALUE;
	
	System.out.println(byteMinSayi);
	
	Byte byteMaxSayi= Byte.MAX_VALUE;
	System.out.println(byteMaxSayi);
		
		
	// variable olusturmadan shortun en kucuk ve en buyuk degerlerini yaz
	
	System.out.println(Short.MIN_VALUE);
	System.out.println(Short.MAX_VALUE);
	
	// integer veri turunun wrapper classı Integer dır.yazdırın
	// integer in max ve min degerleini 
	
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);
	

	
	
	// Boolean, Character, Byte, Short, Integer, Long, Float, Double
	
		
		
		
		
		
		

	}

}
