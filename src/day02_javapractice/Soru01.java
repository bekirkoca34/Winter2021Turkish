package day02_javapractice;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*  Kullanicidan 3 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
        *
        * Ornek : Inputs : Ali, topu, tut
        *         Output : Ali topu tut.
		*/
	
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String str1=scan.next().toLowerCase();
		System.out.println("Lutfen bir kelime giriniz");
		String str2=scan.next().toLowerCase();
		System.out.println("Lutfen bir kelime giriniz");
		String str3=scan.next().toLowerCase();
		
		System.out.println(str1+" "+str2+" "+str3+".");
		
		
		
		
		scan.close();
		

	}

}
