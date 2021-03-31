package questionssolutions;

import java.util.Scanner;

public class Soru2_StringMethods {

	public static void main(String[] args) {
		/* StringMethods
        String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
       ORNEK:
        INPUT      :  goat
                      photo
                      ghost
                      kalem
                      
        OUTPUT :      gat
                      hoto
                      ghost
                      lem
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir string giriniz");
		String str=scan.nextLine().toLowerCase();
		
		ilkIkiHarfHaric(str);
		
		scan.close();

	}
	public static void ilkIkiHarfHaric(String s) {
		
		if(s.startsWith("gh")) {
			System.out.println(s);
	     }else if(s.startsWith("g")) {
	    	 System.out.println((s.charAt(0)+s.substring(2)));
	     }else if(s.charAt(1)=='h') {
	    	 System.out.println(s.substring(1));
	     }else {
	    	 System.out.println(s.substring(2));
	     }
		
	}

}
