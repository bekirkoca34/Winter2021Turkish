package practiceday1;

import java.util.Scanner;

public class Soru7 {

	public static void main(String[] args) {
		// kullanicidan iki sayi girmesini isteyin,
		// kullaniciya dort islem menusunu gosterin ve birini secmesini isteyin
		// kullanicinin secimine gore girilen sayilarin islem sonucunu yazdirn

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sayi giriniz");
		double a= scan.nextDouble();
		System.out.println("lutfen bir sayi daha giriniz");
		double b= scan.nextDouble();
		
		System.out.println("lutfen dort islemden birini seciniz \n1. Toplama \n2. Cikarma \n3. Carpma \n4. Bolme");
		int secim= scan.nextInt();
		
		if(secim==1) {
			System.out.println("girilen sayilarin toplami : " + (a+b));
		}else if (secim==2) {
			System.out.println("Girilen sayilarin farki : " + (a-b));
			
		}else if (secim==3) {
			System.out.println("Girilen sayilarin carpimi : " + (a*b));
		}else if(secim==4) {
			System.out.println("Girilen sayiarin bolumu : " + (a/b));
		}else {
			System.out.println("yanlis giris yaptiniz");
			
			
		}
		
		
		
		
		
		
	}

}
