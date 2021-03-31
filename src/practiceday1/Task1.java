package practiceday1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// 
		/* Kullanicidan iki sayi girmesini isteyin. Kullaniciya dort islem menusunu
        * gosterin ve birini secmeleri isteyin.
        * Kulanicinin secimine gore girilen sayilarin islem sonucu yazdirin
        */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen islem yapmak icin iki sayi giriniz");
		
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		System.out.println("Yapmak istediginiz dort islem turunun numarasini giriniz \n1. Toplama \n2 Cikarma \n3 Carpma \n4 Bolme");
		
		int sonuc=scan.nextInt();
		
		if(sonuc==1) {
			System.out.println("İki sayinin toplami : " +(sayi1 + sayi2));
		}else if(sonuc==2) {
			System.out.println("İki sayinin farki : " + (sayi1-sayi2));
		}else if (sonuc==3) {
			System.out.println("İki sayinin carpimi : " + (sayi1*sayi2));
		}else if(sonuc==4) {
			System.out.println("İki sayinin bolumu : " + (sayi1/sayi2));
		}else {
			System.out.println("Lutfen gecerli bir islem giriniz");
		}
		
		
		
		
		
		
		
		

	}

}
