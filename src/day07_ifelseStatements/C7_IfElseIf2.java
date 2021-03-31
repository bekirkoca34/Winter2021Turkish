package day07_ifelseStatements;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// kullanicidan iki sayi isyeyin, 
		//ikiside pozitif ise sayılain toplamini yazdirin, sayı giriniz
		// negatif ise carpimini,
		//farkli isaretli ise farklı isaretlerle islem yapamazsiniz
		//sıfır var ise "sıfır carpmaya gore yutan" yazdırın
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz");
		
		double sayi1= scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1==0 || sayi2 == 0) {
			System.out.println("Sifir carpmaya gore yutan eleman");
		} else if (sayi1>0 && sayi2> 0) {
            System.out.println("sayilarin toplami :"+ (sayi1+sayi2));
		} else if (sayi1<0 && sayi2<0){
			System.out.println("sayilarin carpimi : "+ (sayi1*sayi2));
		}else {
			System.out.println("farkli isratelerde sayilarla islem yapamazsin");
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
