package practiceday1;

import java.util.Scanner;

public class Task_IfElseRevison2 {

	public static void main(String[] args) {
		// kullanicidan bir karakter girsin
		// harf olup olamdigini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir karakter giriniz");
		char harf = scan.next().charAt(0);

		if ((harf >= 'a' && harf <= 'z') ||(harf >= 'A' && harf <= 'Z')) {
			System.out.println("giridiginiz karakter harf");
		} else {
			System.out.println("harf degil");
		}
		scan.close();
 
	} 


}
