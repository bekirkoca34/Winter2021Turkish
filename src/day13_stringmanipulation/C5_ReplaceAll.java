package day13_stringmanipulation;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		// 
		
		String str="Java ogren, mutlu ol, Java candir 12334";
		System.out.println(str.replace("Java", "hava"));
		
		// replaceAll() method'una benzer ama 2 farkı vardir.
		//  1) replace() method'u char kabul eder ama replaceAll() kabul etmez
		//  2)
		
		System.out.println(str.replaceAll("\\w", "*"));// tum harf ve rakamlarin yerine * yazar
		System.out.println(str.replaceAll("\\W", "*"));// w'nun tersi
		System.out.println(str.replaceAll("\\d", "."));// sayilari . yapar
		System.out.println(str.replaceAll("\\D", "."));// sayi olmayanlari . yapar
		System.out.println(str.replaceAll("\\s", "&"));// bosluklari & yapar
		System.out.println(str.replaceAll("\\S", "&"));// bosluk haric herseyi & yapar
		
		
		
		
		
		

	}

}
