package day50_java;

import java.util.Scanner;

public class ArtikYilNestedIf {

	public static void main(String[] args) {
		// Kullanicidan artik yil olup olamdigini kontrol etmek icin yil girmesini
		// isteyin
		// kural 1 : 4 ile bolunemeyeb artik yil degil
		// kural 2 : 4 ve 400 un kati olanlar artik yildir.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yil giriniz");
		int yil = scan.nextInt();

		if (yil % 100 == 0) {// 100 e bolunebiliyor

			if (yil % 400 == 0) {
				System.out.println("Artik yil");
			} else {
				System.out.println("Artik yil degil");
			}

		} else {// 100 ile bolunemiyorsa

			if (yil % 4 == 0) {
				System.out.println("Artik yil");
			} else {
				System.out.println("Artik yil degil");
				
				scan.close();
			}

		}

	}

}
