package day60_javahomework;

import java.util.Scanner;

public class HomeWork3_Question1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your email adress, Please");
		String email=scan.next().toLowerCase();
		
		System.out.println(email.contains("@") ? "@ isareti var " : "Gecerli bir mail giriniz ");
		System.out.println(email.contains("@gmail.com") ? "emailiniz onaylandi" : "lutfen gmail adresinizi giriniz");
		
		int sonuc=email.indexOf("@gmail.com");
		
		System.out.println(sonuc==1 ? "dogru email adresi" : "Lutfen gmail hesabinizi giriniz");
		

	}

}
