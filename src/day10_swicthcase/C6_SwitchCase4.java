package day10_swicthcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullanicidan VIP (Very Important Person)kisaltmasindan hangi harfin anlamini istedigini soralim
		// girilen harfin aciklamasini yazdiralim
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen anlamini isteginiz harfi giriniz");
		
		char harf= scan.next().charAt(0); 
		
		switch(harf) {
        case 'V':
        case 'v':
        	System.out.println("Very");
        	break;
        case 'I':
        case 'i':
        	System.out.println("Important");
        	break;
        case 'P':
        case 'p':
        	System.out.println("Person");
        	break;
        default:
        	
		System.out.println("gecersiz harf");
		
		}
		
	
		//kullanicinin birden fazla harf girmesini sorun olarak kabul ediyorsaniz
		// ve bunu hata olarak kullaniciya bildirmek istiyorsaniz	
		
		System.out.println("lutfen harf giriniz");
		String str=scan.next();
		
		switch(str) {
        case "V":
        case "v":
        	System.out.println("Very");
        	break;
        case "I":
        case "i":
        	System.out.println("Important");
        	break;
        case "P":
        case "p":
        	System.out.println("Person");
        	break;
        default:
        	
		System.out.println("gecersiz harf");
		scan.close();
		}
		

	}

}
