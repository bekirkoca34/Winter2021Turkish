package javapractice_day04;

import java.util.Iterator;
import java.util.Scanner;

public class C5 {

	public static void main(String[] args) {
		/*
	  	Kullanicini girdigi sayi kadar sekildeki gibi yarim piramit olusturan java programi yaziniz.
	    Ornek : kullanici 5 sayisini girdiginde yarim piramit olusacak ==>  1 2 3 4 5
																			1 2 3 4
																			1 2 3
																			1 2
																			1
    */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayinin giriniz");
		int a = scan.nextInt();

		tersPiramit(a);


	}
	
	public static void tersPiramit(int n) {
		
		for(int i=n ; i>=1 ; i--) {
			for (int j=1; j<=i; j++) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
	}

}
