package day08_ifelseifstatement;

import java.util.Scanner;

public class C5_NestedIf {

	public static void main(String[] args) {
		// Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		 /* 
		  *  Kullanicidan bir sifre girmesini isteyin
		  ==>Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. 
		     Ilk harf A ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		  ==>Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. 
		     Ilk harf z ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		  
       */
		
	 

		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen sifre giriniz");
		
		char ilkHarf= scan.next().charAt(0);
		
		if (ilkHarf>='A' && ilkHarf<='z') {//ilk harf buyuk ise
			
			if (ilkHarf=='A') {
				System.out.println("sifre gecerli");
			} else {
                System.out.println("sifre gecersiz buyuk harf giriniz");
			}
			
			
		} else if (ilkHarf>='a' && ilkHarf<='z'){//ilk harf kucuk ise
			
			if (ilkHarf=='z') {
				System.out.println("sifre gecerli");
			} else {
                System.out.println("sifre gecersiz kucuk harf giriniz");
			}

		}else {// ilk harf buyuk harf veya kucuk harf degilse
			
			System.out.println("sifre gecersiz");
			
		}
				
		scan.close();
		
		
		
		
	}

}
