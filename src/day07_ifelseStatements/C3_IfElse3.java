package day07_ifelseStatements;

import java.util.Scanner;

public class C3_IfElse3 {

	public static void main(String[] args) {
		// kullanicidan yasini sorun 65 den buyukse emekli olabilirsin
		// yoksa olamazsiniz yazdirin
		
		
	 Scanner scan= new Scanner(System.in);
	 System.out.println("Lutfen yasinizi giriniz");
	 
	 int yasiniz= scan.nextInt();
	 
	 if (yasiniz>=65) {
		System.out.println("Emekli olabilirsiniz");
	} else {
       System.out.println("emekli olamazsiniz");
	}
	 
	 
		
		scan.close();
		
		
		
		
		
		

	}

}
