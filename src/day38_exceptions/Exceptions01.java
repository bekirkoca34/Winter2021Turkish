package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// Kullanicidan iki tam sayi alin ve bolumlerinin yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bolunecek tam sayiyi girin ");
		int sayi1=scan.nextInt();
		System.out.println("Lutfen bolen sayiyi girin");
		int sayi2=scan.nextInt();
		
		// Java exceptions'i handle etmek icin try-catch blogu olusturmustur. (Sifir a bolme riskini onlemek icin)
		
		
		try {
			System.out.println("bolme isleminin sonucu : " + sayi1/sayi2);
			
		} catch (ArithmeticException e) {
			System.out.println("sayiyi sifira bolemezsin");
			
		}
		scan.close();
	}

}
