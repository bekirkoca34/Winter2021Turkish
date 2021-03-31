package questionssolutions;

import java.util.Scanner;

public class AdvanceSoru2 {

	public static void main(String[] args) {
		/* 

		kullanicidan 3 basamakli bir sayi alip sayinin okunusunu yazdiriniz
		
		
		*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir uc bamakli sayi giriniz");
		int number=scan.nextInt();
		
		int yuzler=number/100, onlar=number/10%10, birler=number%10;
		
		//System.out.println(yuzler +" "+ onlar +" " +birler);
		
		if(number>99 && number<1000)
		switch(yuzler) {
		  case 1:
		      System.out.println("yuz ");
		      break;
		  case 2:
			  System.out.println("ikiyuz ");
			  break;
		  case 3:
		      System.out.println("ucyuz ");
		      break;
		  case 4:
			  System.out.println("dortyuz ");
			  break;
		  case 5:
		      System.out.println("besyuz ");
		      break;
		  case 6:
			  System.out.println("altiyuz ");
			  break;
		  case 7:
		      System.out.println("yediyuzr ");
		      break;
		  case 8:
			  System.out.println("sekizyuz ");
			  break;
		  case 9:
		      System.out.println("dokuzyuz ");
		      break;
		  
		}
		switch(onlar) {
		case 1:
		      System.out.println("on ");
		      break;
		  case 2:
			  System.out.println("yirmi ");
			  break;
		  case 3:
		      System.out.println("otuz ");
		      break;
		  case 4:
			  System.out.println("kirk ");
			  break;
		  case 5:
		      System.out.println("elli ");
		      break;
		  case 6:
			  System.out.println("altmis ");
			  break;
		  case 7:
		      System.out.println("yetmis ");
		      break;
		  case 8:
			  System.out.println("seksen ");
			  break;
		  case 9:
		      System.out.println("doksan ");
		      break;
		}
		switch(birler) {
		case 1:
		      System.out.println("bir");
		      break;
		  case 2:
			  System.out.println("iki ");
			  break;
		  case 3:
		      System.out.println("uc ");
		      break;
		  case 4:
			  System.out.println("dort ");
			  break;
		  case 5:
		      System.out.println("bes ");
		      break;
		  case 6:
			  System.out.println("alti ");
			  break;
		  case 7:
		      System.out.println("yedi ");
		      break;
		  case 8:
			  System.out.println("sekiz ");
			  break;
		  case 9:
		      System.out.println("dokuz ");
		      break;
		      default:
		    	  System.out.println("lutfen uc basamakli bir sayi giriniz");
		}

	}
	

}
	
