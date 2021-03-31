package day10_swicthcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullanicidan hangi gunde oldugumuzu yaziyla 
		// girilen gunun haftaici veya haftasonu olmasini yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen haftanin hangi gununde oldugumuzu giriniz");
		String gun= scan.next().toLowerCase(); 
		
		
		switch(gun) {
        case "pazartesi":
        	System.out.println("hafta ici");
        	break;
        case "sali":
        	System.out.println("hafta ici");
        	break;
        case "carsamba":
        	System.out.println("hafta ici");
        	break;
        case "persembe":
        	System.out.println("hafta ici");
        	break;
        case "cuma":
        	System.out.println("hafta ici");
        	break;
        case "cumartesi":
        	System.out.println("hafta sonu");
        	break;
        case "pazar":
        	System.out.println("hafta sonu");
        	break;
        default :
            System.out.println("lutfen gecerli bir gun giriniz");
         
            
		// kisa yol
            

    		switch(gun) {
            case "pazartesi":         
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
            	System.out.println("hafta ici");
            	break;
            case "cumartesi":
            case "pazar":
            	System.out.println("hafta sonu");
            	break;
            default :
                System.out.println("lutfen gecerli bir gun giriniz");  
                
                scan.close();
		
    }
		
		
	}

	}
	}
