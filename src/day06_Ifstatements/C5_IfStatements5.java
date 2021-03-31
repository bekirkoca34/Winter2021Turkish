package day06_Ifstatements;

import java.util.Scanner;

public class C5_IfStatements5 {

	public static void main(String[] args) {
		// kullanicidan dikdortgenin iki kenar uzunlugunu alın
		// kenar uzunlukları esit ise kare degilse dikdortgen yazın
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen dikdortgenin iki kenar uzunlugunu giriniz");
		
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("kare");
			
		}
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("dikdortgen");
			
		}
		
		if (kenar1<=0 || kenar2<=0) {
			System.out.println("Lutfen gecerli uzunluk giriniz");
			
		}
		
		
		scan.close();

	}

}
