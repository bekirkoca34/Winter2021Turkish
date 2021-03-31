package day60_javahomework;

import java.util.Scanner;

public class HomeWork_4WeekQ3 {

	public static void main(String[] args) {

		/*   Soru 3: Bu Soru Kullanıcıdan fiyat alınarak da cozuldu, 
		 * Ternary kullanarak: int variable : FIYAT string variable : Secim (String Secim=.....) 
		   price = $10 ise
		   Print “UCUZ” price 10-$20 arasi ise Print “UYGUN” diger durumlar icin “PAHALI” yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir fiyat bilgisi giriniz");
		double fiyat = scan.nextDouble();

		String secim = (fiyat <= 10) ? (fiyat <= 10 ? "Fiyat Ucuz" : "Fiyat Ucuz degil")
				: ((fiyat > 10 && fiyat < 20) ? "Fiyat Uygun" : "Fiyat PAHALİ");

		System.out.println(secim);

		// scan.close();

	}

}
