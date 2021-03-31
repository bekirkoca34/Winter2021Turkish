package practiceday1;

import java.util.Scanner;

public class Tak_IfElseIfRev_2 {

	public static void main(String[] args) {
		// kullanicidan iki sayi isteyin
		// sayilerin ikisi de pozitif ise sayilarin toplamini,
		// ikisi de negatif ise sayilarin carpimini,
		// sayilar farkli isaretli ise "farkli isaretli sayilarda islem yapamazsiniz",
		// sayilardan sifire esit olan varsa "sifir carpmaya gre yutan elemandir"
		// yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers, please");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();

		if (num1 == 0 || num2 == 0) {
			System.out.println("Sifir carpmaya gore yutan elemandir");

		} else if (num1 > 0 && num2 > 0) {
			System.out.println("sayilarin toplami : " + (num1 + num2));

		} else if ((num1 < 0 && num2 < 0) || (num1 > 0 && num2 < 0)) {
			System.out.println("sayilarin carpimi : " + num1 * num2);

		} else {
			System.out.println("farkli isaretli sayilarda islem yapamazsiniz");
		}
scan.close();
	}
}
