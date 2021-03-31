package day09_ternary;

import java.util.Scanner;

public class c4_Ternary4 {

	public static void main(String[] args) {
		// kullanicidan bir sayi alin sayinin tek mi cift mi oldugunu yaziniz

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tam sayi sayi giriniz");
		
		int sayi= scan.nextInt();
		
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		
		
		// girilen sayinin mutlak degerini yazdirin
		
		System.out.println("sayinin mutlak degeri : " +(sayi>0 ? sayi : -sayi));
		
		
		
		
	}

}
