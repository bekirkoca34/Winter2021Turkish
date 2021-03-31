package day11_stringmanupilations;

public class C1_Concatination {

	public static void main(String[] args) {
		// concatination : java da + islemi yapilirken eger toplanan ifadelerrden biri veya
		// her ikisi String ise Java toplama degil birlestirme yapar.

		System.out.println(15+20+"Merhaba");//35merhaba
		
		System.out.println("Merhaba"+15+20);//merhaba1520
		
		System.out.println("merhaba" + (15+20));//merhaba35
		
		System.out.println("merhaba" + 15*20);//merhaba300
		
		String str1 ="Hello";
		String str2 = "World";
		
		//Hello World yazdirmak istersek
		
		System.out.println(str1 +" "+str2);
		
		System.out.println(str1.concat(str2));// HelloWorld
		
		System.out.println(str1.concat(" ").concat(str2));// Hello World
		
		

	}

}
