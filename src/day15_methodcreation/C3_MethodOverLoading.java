package day15_methodcreation;

public class C3_MethodOverLoading {
	public static void main(String[] args) {
      // Java da ayni isimle birden fazla method olusturulursa buna overloading denir.
		// Overloading yapabilmek icn Method Signature'larinin farkli olmasi gerekir.
		// Method Signature= isim+parametre sayisi+ parametre data turu
		// birbirini kapsayan data turlerini oldugunda java en optimum cozumu uretir.
		// birebir uyan varsa o methodu calıstirir, birebir uyan yoksa en optimumu calisitirir.
		//eger kapsayan bir metod da bulmamzsa Java CTE verir.
		
		   
		toplama(21, 23);

	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("integer method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(int sayi1, double sayi2) {
		System.out.println("integer/double method sonucu : " + (sayi1 + sayi2));

	}

	public static void toplama(char char1, char char2) {
		System.out.println("char method sonucu : " + (char1 + char2));

	}

	public static void toplama(double sayi1, double sayi2) {
		System.out.println("double method sonucu : " + (sayi1 + sayi2));

	}

	public static void toplama(String str1, String str2) {
		System.out.println("String method sonucu : " + str1 + str2);

	}
}
