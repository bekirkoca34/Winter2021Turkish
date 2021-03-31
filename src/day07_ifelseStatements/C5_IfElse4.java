package day07_ifelseStatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// kullanicidan ucgenin kenar uzunluklarini alin uc kenar 
		//esitse eskenar ucgen yazdırın yoksa eskenar degil

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen kenar uzunlukalarini giriniz");
		
		double kenar1= scan.nextDouble();
		double kenar2= scan.nextDouble();
		double kenar3= scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eskenar ucgen");
		} else {
           System.out.println("eskenar ucgen degil");
		}
		
		
		
		
		
		
		
		
		
	}

}
