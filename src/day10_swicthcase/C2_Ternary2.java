package day10_swicthcase;

import java.util.Scanner;

public class C2_Ternary2 {

	public static void main(String[] args) {
		// Tkullanicidan bir sayi alin 
		// sayi cift ise "cift" yazdirin
		// degil ise karesi yazdrin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi= scan.nextInt();
		
		// eger ternary de iki durum icin farkli data tipleri donusu oluyorsa
		// ya variable a atama yapmadan direk yazdirilabiliz
		// ya da mumkunsa sonucları ayni data tipine cevirmeye calisabilirz
		
		System.out.println(sayi%2==0 ? "cift" : sayi*sayi);

		
		scan.close();
	}

}
