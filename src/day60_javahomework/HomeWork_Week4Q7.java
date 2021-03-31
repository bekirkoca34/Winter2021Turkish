package day60_javahomework;

import java.util.Scanner;

public class HomeWork_Week4Q7 {

	public static void main(String[] args) {
		/*
		    StringMethods:
			Çift uzunlukta bir degiskenin ilk yarısını konsolda yazdirmak için bir Java programı yazıniz.
	    	     ORNEK:
		     	INPUT      :  Python
			    OUTPUT     :   Pyt
	    */

           Scanner scan=new Scanner(System.in);
           System.out.println("Lutfen bir kelime giriniz");
		   String name1=scan.next();
		   
		   if(name1.length()%2==0) {
			   System.out.println(name1.substring(0,1).toUpperCase()+name1.substring(1, name1.length()/2));
			  
		   }else {
			   System.out.println("Girilen kelime cift sayida karakter icermemekte");
		   }
		
	}

}
