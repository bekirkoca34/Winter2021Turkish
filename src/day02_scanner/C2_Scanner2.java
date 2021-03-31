package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {

	
	
	// kullanıcıdan dairenin yarıçapı isteyin ve dairenin alalınını yazdırın
	
	
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("alanını hesaplamak icin dairenin yaricapini girin");
		
		// kullanıcıdan yaricap istedim,
		// once kullanicinin girdigi yaricapi içine koyabilecegim bir degisken olusturmayalim,
		
		double yaricap=scan.nextDouble();
		
		System.out.println("dairenin alani="+ 3.14*yaricap*yaricap);
		
		
		
		
		
		
		

	}

}
