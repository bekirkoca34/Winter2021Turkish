package day16_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullanicidan pozitif bir tamsayi alin 
		// 1 den kullaninin girdigi sayiya kadar olan butun tamsayilarin toplamini yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		int toplam=0;
		
		for (int i = 1; i <= sayi; i++) {
			toplam=toplam+i;
			
		}
		System.out.print(toplam);     
	}

}
