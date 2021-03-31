package day08_ifelseifstatement;

import java.util.Scanner;

public class C6_Odev {

	public static void main(String[] args) {
		/*
		 Soru 12) Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. 
		  ==>Girdiği sayi 5’e bölünüyorsa  son rakamını kontrol edin. 
		  ==>Son rakamı 0 ise ekrana “5’e bölünen çift sayı�?  yazdırın. 
		  ==>Son rakamı 0 değil ise “5’e bölünen tek sayı�? yazdırın. 
		  ==>Girdiği password  5’e bölünmüyorsa ekrana “Tekrar deneyin�? yazdırın.

		
		
		*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen dort basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
        if (sayi%5==0) {
			
			  if (sayi%10==0) {
				System.out.println("5' e bölünen cift sayı");
				
			} else {
				System.out.println("5' e bölünen tek sayı");
			}
			
		} else {
			System.out.println("tekrar deneyiniz");

		scan.close();
	
		}
		
		}
		
		
		
		
		
		
		
		
		
	}

