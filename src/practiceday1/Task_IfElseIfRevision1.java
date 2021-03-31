package practiceday1;

import java.util.Scanner;

public class Task_IfElseIfRevision1 {

	public static void main(String[] args) {
		// kullanicidan 100 uzerinden notunu isteyin
		// 50 den kucukse"D", 50-60 arasi "c", 60-80 arasi "B", 80 uzeri "A"

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz");
		double not = scan.nextDouble();

		if (not < 0 || not > 100) {
			System.out.println("Lutfen gecerli bir not giriniz");
			
		} else if (not < 50) {
			System.out.println("harf notunuz : D");
		} else if (not < 60) {
			System.out.println("harf notunuz : C");
		} else if (not < 80) {
			System.out.println("Harf notunuz : B");
		} else {
			System.out.println("Harf notunuz : A");
		} 

	}

}
