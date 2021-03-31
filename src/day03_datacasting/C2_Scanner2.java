package day03_datacasting;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {

      
		// Kullanıcıdan isminizi isteyip ilk harfini buyuk harf olarak yazdır
		// mehmet ==> basharf: M
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		char ilkHarf= scan.next().toUpperCase().charAt(0);
		
		// Stringde harflerin indexleri 0'dan başlar
		// biz ilk harfi almak istediğimiz için index olarak 0 girmeliyiz
		
		System.out.println("bas harfiniz: " + ilkHarf);
		
		//

		
		
		scan.close();
	}

}
