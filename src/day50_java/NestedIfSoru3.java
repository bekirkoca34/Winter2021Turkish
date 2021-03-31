package day50_java;

import java.util.Scanner;

public class NestedIfSoru3 {

	public static void main(String[] args) {
		// kullanicidan sifre girmesini isteyin
		// Eger ilk harf buyuk harf ise, "A" ise "gecerli sifre" degilse "gecersiz
		// sifre" yazdirin
		// eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin
		// İlk harf "z" ise "gecerli" degilse "gecersiz" yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen sifre giriniz");
		char harf = scan.next().charAt(0);

		if (harf >= 'A' && harf <= 'Z') {// ilk harf buyuk ise,

			if (harf == 'A') {  
				System.out.println("Sifre gecerli");
			} else {
				System.out.println("Sifre gecersiz");
			}

		} else if (harf >= 'a' && harf <= 'z') {// ilk harf kucuk harf ise

			if (harf == 'z') {
				System.out.println("Sifre gecerli");
			} else {
				System.out.println("Sifre gecersiz");
			}

		} else {
			System.out.println("lutfen gecerli sifre giriniz");// harf olmayan karakterter girisi
		}

	}

}
