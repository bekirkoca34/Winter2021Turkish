package day06_Ifstatements;

import java.util.Scanner;

public class C2_Ifstatements2 {

	public static void main(String[] args) {
		// kullanıcıdan bir sayi ve sayinin tek veya cift sayi oldugunu yazdırın
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		
		int sayi= scan.nextInt();
		
		//153 % 2 == 0 sayi cift,
		//153 % 2 == 1 sayisi tek,
		
		if (sayi%2==0) {
			System.out.println("girdiginiz sayi cift sayidir ");
		}
		if (sayi%2==1 || sayi%2==-1) {
			
			System.out.println("girdiginiz sayi tek sayi");
			
			System.out.println("katildiginiz icin tesekkur ederiz");
			
			scan.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
