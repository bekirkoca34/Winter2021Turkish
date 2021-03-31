package practiceday1;

import java.util.Scanner;

public class Task_IfElseRevision1 {

	public static void main(String[] args) {
		// dikdortgenin kenar uzunluklarini alin
		//uzunluklar esitse kare degilse kare degil yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen kenar uzunluklarini giriniz");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("kare");
		} else {
          System.out.println("kare degil");
		}
		
		
		

	}

}
