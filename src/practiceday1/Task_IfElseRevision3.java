package practiceday1;

import java.util.Scanner;

public class Task_IfElseRevision3 {

	public static void main(String[] args) {
		// kullanicidan yas sorun
		// 65 deb buyukse emekli yoksa degil

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();

		if (yas >= 65) {
			System.out.println("emekli olabilirsiniz");
		} else {
			System.out.println("emekli olamazsınız");
		}

	}

}
