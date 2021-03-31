package practiceday1;

import java.util.Scanner;

public class Asalsayi1 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve alinan sayinin asal olup olmadigini bulan bir
		// program yaziniz

		// 1 ve kendisi disinda hic bir pozitif tamsayiya kalansız blunmeyen

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Asal sayi olup olmadigini ogrenmek icin bir sayi giriniz");
		int sayi = scan.nextInt();

		String flag = "Asal Sayi";

		int bolen = 2;
		while (bolen < sayi) {

			if (sayi % bolen == 0) {
				flag = "Asal sayi degil";

			}

			bolen++;
		}

		System.out.println(flag);

	}

}
