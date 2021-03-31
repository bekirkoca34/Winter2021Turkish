package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Adinizi girin");
		String name=scan.nextLine();   // sadece next() secilirse kullanıcı 
		                               //birden fazla kelime girsede ilk kelime alınır.
		
		System.out.println("Soyadinizi girin");
		String surname=scan.nextLine();
		
		System.out.println(name+" "+surname);
		
	

	}

}
