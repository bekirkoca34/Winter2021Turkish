package day60_javahomework;

import java.util.Scanner;

public class HomeWork_Q5 {

	public static void main(String[] args) {
		/* 
		 Kullanıcını 1 ile 7 arasında bir sayı girdiğinde haftanın hangi günü olduğunu yazdıran
		 switch case java kodunu yazinız.
		*/


		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1 ile 7 arasinda bir tamsayi giriniz");	
		int sayi = scan.nextInt();
		
		switch(sayi) {
		
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7: 
			System.out.println("Pazar");
			break;
		default:
			System.out.println("lutfen gecerli bit tam sayi giriniz");
		
		
		}
		
		
		
		
		
	}

}
