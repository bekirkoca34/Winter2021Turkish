package day07_ifelseStatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// Kullanicidan bir karekter girmesini isteeyin
		// harf olup oladıgını yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir karekter giriniz");
		
		char karakter= scan.next().charAt(0);
		
		if ((karakter>='a' && karakter<='z') || (karakter>='A' && karakter<='Z') ) {
			System.out.println("girdiginiz karakter harf");
		} else {

			System.out.println("girdiginiz karakter harf degil");
		}
		
		scan.close();
		
		
		
		
		
		
		

	}

}
