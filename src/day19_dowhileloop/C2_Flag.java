package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// Kullanicidan bir cumle alin
		// cumlede buyuk harf var mı yok mu yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		
		String flag="yok";
		
		 int index=0;
		 
		 while(index<cumle.length()) {
			 
			 if (cumle.charAt(index)>='A' && cumle.charAt(index)<='Z') {
				flag="var";
			}
			 index++;
		 }
		System.out.println("verdiginiz cumlede buyuk harf " + flag);
		
		
		

	}

}
