package practiceday1;

import java.util.Scanner;

public class Task_IfTekrar2 {

	public static void main(String[] args) {
		// kullanicidan gun ismi isteyin haftaici veya haftasonu oldugunu yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen gun isminini giriniz");
		
		String gunAdi=scan.next().toLowerCase()  ;
		
		if (gunAdi.equals("pazartesi") || gunAdi.equals("sali") || gunAdi.equals("carsamba") || 
			gunAdi.equals("persembe") || gunAdi.equals("cuma"))  {
			System.out.println("haftaici");
		}
		if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
		System.out.println("haftasonu");	
		}
	   scan.close();

	}

}
