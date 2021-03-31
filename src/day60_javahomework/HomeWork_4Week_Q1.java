package day60_javahomework;

import java.util.Scanner;

public class HomeWork_4Week_Q1 {

	public static void main(String[] args) {
		/* Soru 1
	 Kullanicinin girmiş oldugu A,B,C,D,F notlarının karşılığını yazdıran Switch Case kodunu yazınız.
	 A Excellent, B Good, C Average, D Deficient, F Failing
		 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen basari notunuzu harf olarak giriniz");
		String harf = scan.next().toUpperCase();

		switch (harf) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Average");
			break;
		case "D":
			System.out.println("Deficient");
			break;
		case "F":
			System.out.println("Failing");
			break;
		default:
			System.out.println("lutfen gecerli bir basari notu giriniz");

		}

	}
}
