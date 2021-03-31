package practiceday1;

import java.util.Scanner;

public class Task_Iftekrar3 {

	public static void main(String[] args) {
		// 

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen dortgenin bir kenar uzunlugunu giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("Kare");
		}
		if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("dikdortgen");
		}
		if (kenar1<=0 && kenar2<=0 ) {
			System.out.println("lutfen gecerli bir uzunluk giriniz");
		}
		
		
		
		
	}

}
