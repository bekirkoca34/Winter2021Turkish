package practiceday1;

import java.util.Scanner;

public class Task_IfStatement1 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi isteyin ve tek mi cift mi oldugunu yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		
	    int sayi=scan.nextInt();
	    
	    if (sayi%2==0) {
			System.out.println("girilen sayi cift sayidir");
		}
		
		if(sayi%2!=0) {
			System.out.println("girilen sayi tek sayidir");
		}
		 System.out.println(sayi%2);
         System.out.println("tesekkur ederim");
	}

}
