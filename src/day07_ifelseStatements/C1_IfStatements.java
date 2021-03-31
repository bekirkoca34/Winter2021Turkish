package day07_ifelseStatements;

import java.util.Scanner;

public class C1_IfStatements {

	public static void main(String[] args) {
		// kullanıcıdan bir tam sayi isyeteyin
		// sayi pozitif ise "sayi pozitif" yazdirin
		//sayi 100 den kucuk ise "kucuk sayi"
		// sayi 100 den buyyuk ise "buyuk sayi"
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi= scan.nextInt();
		
		if (sayi>0) {
			System.out.println("sayi pozitif");
		}
        
		if(sayi<100) {
			System.out.println("kucuk sayi");
		}
		
		if (sayi>1000) {
			System.out.println("buyuk sayi");
		}
		
		scan.close();
		
		

	}

}
