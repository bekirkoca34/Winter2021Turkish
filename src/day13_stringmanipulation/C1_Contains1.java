package day13_stringmanipulation;

import java.util.Scanner;


public class C1_Contains1 {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve aramak istedigi bir String isteyin
		// cumle String i iceriyorsa "basarili" yoksa "basarisiz" yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine().toLowerCase();
		System.out.println("Lutfen aranmasini istediginiz String' i giriniz");
		String aranan=scan.nextLine().toLowerCase();
		
		
		// bu islemin sonucu boolean,
		
		System.out.println(cumle.contains(aranan) ? "Basarili" : "Basarisiz");
		
		
		// kullanicidan mail adresini isteyin. mail adresi @gmail.com iceriyorsa 
		//"mailiniz kaydedildi", yoksa "lutfen gmail adresi giriniz" yazdirin
		
        System.out.println("lutfen mailinizi giriniz");
        String email=scan.next();
        
        System.out.println(email.contains("@gmail.com") ? "Basarili" : "Basarisiz");
       
        
        // if' li cozum;
        
        int sondami=email.indexOf("@gmail.com", email.length()-10);
        
        if(email.contains("@gmail.com") && sondami!=-1) {
        	System.out.println("mailiniz kaydedildi");
        }else {
        	System.out.println("lutfen gmail adresinizi giriniz");
        }
        
        
        // eger @gmail.com' un en sonda oldugunu kontrol etmek istersek
        
        
        // index olarak length()-10 yazarsam
        // eger email.com ile bitiyorsa bu islemin sonucu bir index olur(int)
        // eger email gmail.com ile bitmiyorsa -1
        
        
        
        
        
	}

}
