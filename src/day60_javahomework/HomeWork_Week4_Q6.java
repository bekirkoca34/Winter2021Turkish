package day60_javahomework;

import java.util.Scanner;

public class HomeWork_Week4_Q6 {

	public static void main(String[] args) {
		
		/* Kullanıcıdan firstName ve lastName'i girmesini isteyin, 
		 * ardından baş harflerini büyük harf yapın ve geri kalanı tamamen kucuk harf olarak konsolda yazdirin.          
		   ferhat => Ferhat
		   kirac => Kirac
		   
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen adinizi ve soyadinizi sirasiyla giriniz");
		String  firstName= scan.next().toLowerCase();
		String  lastName= scan.next().toLowerCase();
		
		
        System.out.println(firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase());
        System.out.println(lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase());
	}

}
