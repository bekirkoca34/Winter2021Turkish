package day06_Ifstatements;

import java.util.Scanner;

public class C3_IfStatements3 {

	public static void main(String[] args) {
		// kullanicidan gun isminin ilk harfini isyeyin ve harfe uygun
		// olan gun isimlerini yazdirin
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("lutfen gun isminin ilk harfini giriniz");
		
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		//bu satır itibariyle girilen String in ilk kararakterini almıs oldum
		
		//p,s,c
		
		if (ilkHarf=='p' || ilkHarf=='P') {
			
			System.out.println("pazar,pazartesi veya persembe");
		}
		if (ilkHarf== 's'|| ilkHarf== 'S') {
			System.out.println("sali");
			
		}
		
		if (ilkHarf=='c' || ilkHarf=='C') {
			System.out.println("carsamba, cuma veya cumartesi");
			
			}
		if (ilkHarf!='p' && ilkHarf!='P' && ilkHarf!='s' && ilkHarf!='S'
				&& ilkHarf!='c' && ilkHarf!='C') {
			
			System.out.println("Lutfen gecerli bir harf giriniz");
			
		}
		scan.close();


		
		
		
		
		
		
		
		
		
	}

}
