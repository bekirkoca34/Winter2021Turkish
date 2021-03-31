package day07_ifelseStatements;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		// kullanicidan dikdortgenin kenar uzunluklarinı alın
		//uzunluklar esit ise kare, degilse kare değil yazdırın
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen kenar uzunluklarini giriniz");
		
		double kenar1= scan.nextDouble();
		double kenar2= scan.nextDouble();
		
		
		if (kenar1==kenar2) {
			System.out.println("Kare");
		} else {
			System.out.println("kare degil");

		}
		

		scan.close();
		
		
		
		
		
		
		
		
	}

}
