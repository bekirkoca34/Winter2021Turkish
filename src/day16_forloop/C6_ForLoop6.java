package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question Kullanicidan bir String isteyin ve 
		//          Stringi tersine ceviren bir program yazin.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersine cevirmek icin bir String giriniz");
		String str= scan.nextLine();
		
		
		
		
		
		//2.yol
		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.charAt(i));
		}
		
		
		
		
		
		scan.close();
		
	}

}
