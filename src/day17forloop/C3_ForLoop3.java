package day17forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// Kulllanicidan 40 dan kucuk bir pozitif bir sayi alin
		// girilen sayinin faktoriyelini hesaplayip yazdiran bir method olusturun
		
		
		Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen faktoriyel bulmak icin  35 den kucuk pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();
		
		if (sayi<0 || sayi>35) {
			System.out.println("Lutfen gecerli bir sayi giriniz");
		} else {
            faktoriyelBul(sayi);// method call
		}
		
	}
     
	 public static void faktoriyelBul(int sayi) {
		 long faktoriyel=1;
		  
		 for (int i = 1; i <=sayi; i++ ) {
			faktoriyel*=i;
		}
		 System.out.println(faktoriyel);
		 
	}
	
	
}
