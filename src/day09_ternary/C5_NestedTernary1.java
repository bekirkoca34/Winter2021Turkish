package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		// kullanicidan didortgenin kenar uzunluklarıni alin
		// kare mi dikdortgen mi yazdirin
		
		

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dikdortgenin kenar uzunluklarini giriniz");
		
		double kenar1= scan.nextDouble();
		double kenar2= scan.nextDouble();
		
		System.out.println(kenar1>0 && kenar2>0 ? 
				          (kenar1==kenar2 ? 
				          "kare" : "kare degil") : "gecersiz kenar uzunlugu");
		
		
		scan.close();
		
	}

}
