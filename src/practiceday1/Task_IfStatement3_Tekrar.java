package practiceday1;

import java.util.Scanner;

public class Task_IfStatement3_Tekrar {

	public static void main(String[] args) {
		//  kullanicidan bir tam sayi isteyin
		// sayi pozitif ise "sayi pozitif" ve 100 den kucuk ise kucuk sayi, byuykse buyuk yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int tamsayi=scan.nextInt();
		
		if (tamsayi>0) {
			System.out.println("Girilen sayi pozitif bir tamsayidir");
		}
		if (tamsayi<100) {
			System.out.println("Girilen sayi kucuk sayidir");
			
		}
		if (tamsayi>1000) {
			System.out.println("Girilen sayi buyuk sayidir");
		}
		 
		
		scan.close();
		
		
		

	}

}
