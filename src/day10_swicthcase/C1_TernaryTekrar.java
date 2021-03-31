package day10_swicthcase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		// Soru5 ) Kullanicidan bir sayi alin ve sayi 3 basamakli ise
		//“uc basamakli pozitif sayi�?, yoksa  “Uc  basamakli degil�? yazdirin

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi= scan.nextInt();
		
		String sonuc= sayi>99 ? (sayi<1000 ? "uc basamakli" : "uc basamakli degil" ): "uc basamakli degil";
		
		System.out.println(sonuc);
		
		
		// nested ternary olmasın
		
		String sonuc2= sayi>=100 && sayi<1000 || sayi<= -100 && sayi>= -1000? "uc basamakli" : "uc basamakli degil";
		
		System.out.println(sonuc2);
		
		
	}

}
