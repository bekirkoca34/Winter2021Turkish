package practiceday1;

import java.util.Scanner;

public class Task_Ifstatement2 {
	public static void main(String[] args) {

		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen gun isminin ilk harfini giriniz");
		
		char ilkHarf=scan.next().charAt(0);
		
		if (ilkHarf=='c' || ilkHarf=='C') {
			System.out.println("cuma, cumartesi " + "veya " + "carsamba");
		}
		if (ilkHarf=='p' || ilkHarf=='P') {
			System.out.println("pazar, pazartesi " + "veya "+ "persembe" );
		}
		if(ilkHarf=='s' || ilkHarf=='S') {
			System.out.println("sali");
		}
		if (ilkHarf!='p' && ilkHarf!='P' && ilkHarf!='s' && ilkHarf!='S' && ilkHarf!='c' && ilkHarf!='C') {
			System.out.println("lutfen gecerli bir harf giriniz ");
		}
		
		
		
	}
}
