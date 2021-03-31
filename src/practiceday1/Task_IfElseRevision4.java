package practiceday1;

import java.util.Scanner;

public class Task_IfElseRevision4 {

	public static void main(String[] args) {
		// ucgenin kenar uzunluklarini alın
		// esitse eskenar degilse degil

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen ucgenin kenar uzunluklarini giriniz");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();

		if (kenar1 == kenar2 && kenar1 == kenar3) {
			System.out.println("eskenar ucgen");
		} else {
			System.out.println("eskenar ucgen degil");
		}
		scan.close();
	}

}
