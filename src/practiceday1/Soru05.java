package practiceday1;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		// 
		// kullanicidan girdigi 4 basamakli sayinin rakamalari toplami
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dort basamakli bir sayi giriniz");
		
		int sayi= scan.nextInt();
		int binlerBsm=sayi/1000;
		int yuzlerBsm=sayi/100%10;
		int onlarBsm=sayi/10%10;
		int birlerBsm=sayi%10;
		
		System.out.println("sayinin rakamlari toplami = " + (binlerBsm + yuzlerBsm + onlarBsm + birlerBsm));
		
		scan.close();

	}

}
