package questionssolutions;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
	 /*
	     * Kullanicidan uc basamakli bir sayi alin
	     * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
	     *
	     *
	     * Ornek : Inputs : 853
	     * Output : Girdiginiz sayinin birler basamagi : 3
	     *          Girdiginiz sayinin onlar basamagi : 5
	     *          Girdiginiz sayinin yuzler basamagi : 8
	     *
	     */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen ucbasamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		int yuzler=sayi%100, onlar=sayi/10%10, birler=sayi%10;
		
				//System.out.println("sayinin : " + yuzler);
				
		if(sayi>99 && sayi<1000) {
			System.out.println("girdiginiz sayinin birler basamagi : "+ birler);
			System.out.println("girdiginiz sayinin onlar basamagi : " + onlar);
			System.out.println("girdiginiz sayinin yuzler basamagi : "+ yuzler);
		}else {
			System.out.println("lutfen uc basamakli sayi giriniz");
		}


	}

}
