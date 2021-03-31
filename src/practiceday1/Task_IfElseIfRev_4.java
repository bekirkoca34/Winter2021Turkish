package practiceday1;

import java.util.Scanner;

public class Task_IfElseIfRev_4 {

	public static void main(String[] args) {
		// Kullanicidan gun ismini yazmasini isteyin
		// girilen isim gecerli bir gun ise 
		// isminin 1. 2. ve 3. harflerini ilk harf buyuk dierleri kucuk olarak yazdirin
		// gun ismi gecerli degilse "gecerli gun ismi giriniz" yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen gun ismini giriniz");
		
		String gun=scan.nextLine();
		
		if (gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		}else if (gun.equalsIgnoreCase("Sali")) {
			System.out.println("Sal");
		} else if (gun.equalsIgnoreCase("carsamaba")) {
			System.out.println("Car");
		} else if(gun.equalsIgnoreCase("persembe")) {
           System.out.println("Per");
		}else if(gun.equalsIgnoreCase("cuma")|| gun.equalsIgnoreCase("cumartesi")){
			System.out.println("Cum");
		}else{
			System.out.println("lutfen gecerli bir gun ismi giriniz");
		}
		{

		}
		 
		
		
		
		
		
		
		
scan.close();
	}

}
