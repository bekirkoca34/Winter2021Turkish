package day50_java;

import java.util.Scanner;

public class NestedIfOdevSoru4 {

	public static void main(String[] args) {
		// kullanicidan 4 basamakli bir sayi girmesini isteyin
		// sayi 5 ile bolunebiliyorsa son rakami kontrol edin
		// eger 5 bolunuyor ve son rakam 0 ise sayi "cift sayi"
		// eger 5 bolunemiyorsa 5 bolunumeyen tek sayi yazdirin
		
		
				
				Scanner scan=new Scanner(System.in);
				System.out.println("lutfen dort basamakli bir sayi giriniz");
				int sayi=scan.nextInt();
				
				if (sayi%5==0 && sayi<10000 && sayi>999) {
					
					if (sayi%2==0) {
						System.out.println("Sayi 5 ile bolunebilen cift sayidir");
					} else {
                        System.out.println("Sayi 5 ile bolunebilen tek sayidir ");
					}
					
				} else if(sayi%5!=0) {
					
					if (sayi%2!=0) {
						System.out.println("sayi 5 ile bolunemeyen tek sayidir");
					} else {
                        System.out.println("sayi cift sayidir");
					}

				}else {
					System.out.println(" 4 basamakli sayi giriniz");
					
				}
		
		
		

	}

}
