package practiceday1;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		// Kullanicidan bir karakter isteyip, o karaketerin ASCII degerini yazdirin
		// # isaretinin ascii degerini yazdiriniz,
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir karakter giriniz");
		char karakter=scan.next().charAt(0);
		
		//1.yol
		//int karakterAscii=(int) karakter;// casting yaptık
		//System.out.println("girdiginiz " + karakter + " karakterin ascii degeri :" + karakterAscii);
		
		//ikinci yol
		System.out.println(karakter+0);
		
		
		
		scan.close();
		
		

	}

}
