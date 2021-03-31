package javapractice_day04;

import java.util.Scanner;

public class C1_Method1 {

	public static void main(String[] args) {
		/*
		 * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan
		 * sayi kadar return eden metod yaziniz
	
		 * ornek input elma 2 army 3
		
		 * output eaea ayayay
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir string degerr giriniz");
		String input=scan.nextLine().toLowerCase();
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
	
		System.out.println(ilkSonHarf(input, sayi));
		
	}
	
	public  static String ilkSonHarf (String str, int n) {
		
		String s = str.substring(0,1) + str.substring(str.length()-1);
		String b="";
		
		for (int i = 1; i <= n; i++) {
			b=b+s;
		}
	
		return b;
	}

}
