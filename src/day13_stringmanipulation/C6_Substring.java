package day13_stringmanipulation;

public class C6_Substring {

	public static void main(String[] args) {
		// 
		String str="Her ders Java gibi olsa";
		
		// soru: str'in ilk 10 harfini * ile gizleyin, geriye kalanlar normal yazilsin
		
		
		System.out.println(str.substring(10));// 10.index dahil(inclusive) sonuna kadar tum String
		System.out.println(str.substring(str.length()-10));// son 10 harfi yazdirir
		
		// ilk 10 karakteri alma
		System.out.println(str.substring(0, 10));// substring(0, 10) yazildiginda
		                                       // 0 inclusive, 10 exclusive(dahil degil)
		                                          
		
		// 11. karakterden sonuna kadar olan String i yazdiralim
		System.out.println(str.substring(10));
		
		
		// soru: str'in ilk 10 harfini * ile gizleyin, geriye kalanlar normal yazilsin
		System.out.println("**********" + str.substring(10));
		
		// diger bir yol
		System.out.println(str.substring(0, 10).replaceAll("\\D", "*") + 
				            str.substring(10));//sayilar ne olacak? bag var? 
		
		
		System.out.println(str.substring(10, 10));// baslangic indexi olsun der, ama bitis indexi
		                                          // olmasin der, Java son soylenei yapar..""
		
		
		// System.out.println(str.substring(8, 7));// RTE
		
		System.out.println(str.substring(22));// length()-1 ==>son karakter
		System.out.println(str.substring(23));// length()   ==>bos
		//System.out.println(str.substring(24));//length() ==> buyuk sayi RTE verir
		
		
		String str3=str.substring(0, 10); // str' in ilk 10 harfini verir
		str3=str.replaceAll("\\W", "a");
		System.out.println(str3.replaceAll("\\w" ,"*") + str.substring(10));
		
		

	}

}
