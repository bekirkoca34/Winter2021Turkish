package day60_javahomework;

import java.util.Scanner;

public class HomeWork_4WeekQ2 {

	public static void main(String[] args) {
		/*  Soru 2
		 Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
		*/


		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir ay adi giriniz");
		String months = scan.next().toLowerCase();
		
		
		switch(months) {
		
        case "ocak":
        	System.out.println("31");
        	break;
        case "subat":
        	System.out.println("28");
        	break;
        case "mart":
        	System.out.println("31");
        	break;
        case "nisan":
        	System.out.println("30");
            break;
        case "mayis":
        	System.out.println("31");
        	break;
        case "haziran":
        	System.out.println("30");
        	break;
        case "temmuz":
        	System.out.println("31");
        	break;	
        case "agustos":
        	System.out.println("31");
        	break;
        case "eylul":
        	System.out.println("30");
        	break;
        case "ekim":
        	System.out.println("31");
        	break;
        case "kasim":
        	System.out.println("30");
        	break;
        case "aralik":
        	System.out.println("31");
        	break;
        default:
            System.out.println("lutfen gecerli bir ay adi giriniz");
        }
	
	}

}
