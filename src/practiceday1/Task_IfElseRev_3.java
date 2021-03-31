package practiceday1;

import java.util.Scanner;

public class Task_IfElseRev_3 {

	public static void main(String[] args) {
		// maas verisi isteyin
		// eger teklif 80 000 uzerisi kabul
		// teklif 60000- 80000 arasi uzeri ise goruselim
		// 60000 asagı kabul edemem

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen maas teklifinizi giriniz");
		double maas = scan.nextDouble();

		if (maas > 80000) {
			System.out.println("teklifi kabul ediyorum");
		} else if (maas > 60000) {
			System.out.println("Gorusebiliriz");
		} else {
			System.out.println("kabul edemem");
		}
scan.close();
	}

}
