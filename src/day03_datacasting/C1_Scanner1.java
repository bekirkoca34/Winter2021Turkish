package day03_datacasting;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		// kullanıcıdan isim ve soyismi isteyip ;
		// isim : Mehmet
		// soyisim: Bulutluoz
		// kursumuza kaydınız alınmıştır
		
		//Scanner kullanicidan bilgi almak için kullaniyoruz
		// 3 adimda işlemi tamamliyoruz.
		// 1.adimda Scanner objesi olusturuyoz.
		// Scanner in çalışması için java.util kutuphanesinden 
		//  ilgili kısmı classimiza import etmeliyiz...
		
		Scanner scan = new Scanner(System.in);
		
		// 2. adım kulliciya ne istedigimizi belirten bir mesaj yazmaliyiz,
		
		System.out.println("Lutfen isminizi giriniz");
		
		
		// 3. adım, bir variable olusurup kullacıdan girdiği atayacağız,
		
		
		String name= scan.nextLine();
		
		System.out.println("Lutfen sadece soyisminizi giriniz");
		
		// String surname= scan.next(); bu şekilde yazarsak soyisimdeki tek ismi alır,
		
		String surname= scan.nextLine();
		
		//benden istenen sekilde ciktiyi yazdirabiliriz,
		// eger yazdiracagimiz yazi sabit " " arasına yazdiriyoruz
		// eger bir variable ise atanmis değeri yazdırmak istersek 
		// " " olmadan sadece variable ismini yaziyoruz
		
		System.out.println("isminiz: "+ name);
		
		System.out.println("soyisminiz: "+ surname);
		
		System.out.println("kursumuzua kaydiniz alınmistır "+ name);
		
		scan.close();
		

	}

}
