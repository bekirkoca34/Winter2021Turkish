package day12_stringmanupilation;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// IndexOf methodu bize istedigimiz karakter(lerin) indexini dondurur.
		
		
		String str="java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6));// g
		
		System.out.println("char arama : "+ str.indexOf('g'));//6
		
		System.out.println("String arama :" + str.indexOf("g"));//6
		
		System.out.println("String kelime arama :"+ str.indexOf("is"));// i==>12 s==>13
		
		System.out.println("birden fazla varsa " + str.indexOf('i'));// ilk buldudgunu getirir
	
		
		System.out.println("baslangic indexi ile " + str.indexOf('a', 4));//baslangic indx i inclusive
		
		
		System.out.println("olmayan harf " + str.indexOf("dert"));//
		
		// kullanicidan bir cumle isteyin
		// case sensitive olmadan Java kelimesi icerip icermedigini yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine().toLowerCase();
		
		int sonuc=cumle.indexOf("java");// Java varsa, ilk java kelimesinin index'ini dondurur.
		                                 // java yoksa, -1
		
		System.out.println(sonuc==-1 ? "Java icermiyor" : "Java iceriyor");
		
		
		if(cumle.indexOf("java")>=0) {
			System.out.println("Java iceriyor");
		}else
			System.out.println("cumle java icermiyor");
		
		

	}

}
