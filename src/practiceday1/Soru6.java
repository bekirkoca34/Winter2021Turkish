package practiceday1;

import java.util.Scanner;

public class Soru6 {

	public static void main(String[] args) {
		// Kullanıcıdan ara notu, final notunu ve proje notunu girmesini isteyin
        // Genel notu hesaplayın (ara sınav:% 30, proje:% 20, final:% 50)
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("donem ara sinav notunuzu giriniz");
		double arasinav= scan.nextDouble();
		
		System.out.println("lutfen final notunuzu giriniz");
		double finalsinav= scan.nextDouble();
		
		System.out.println("lutfen proje notunuzu giriniz");
		double proje= scan.nextDouble();
		
		double genelNot= (arasinav*0.3)+(finalsinav*0.5)+(proje*0.2);
		System.out.println("Genel Not : " + genelNot);
		
		
		scan.close();
		
		
		
		

	}

}
