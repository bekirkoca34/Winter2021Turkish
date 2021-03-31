package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// Kullanican bir cumle ve bir harf isteyin
		// while loop kullanarak istenen harf kac kez kullanilmis bulunuz
		// program case sensiteve olsun
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("lutfen saymak istediginiz harfi giriniz");
		String harf=scan.next().substring(0,1);// String olarak ilk harfi alır.
		
		int count=0;
		
		int index=0;
		
		while(index<cumle.length()) {
			if (cumle.substring(index, index+1).equals(harf)) {
				count++;
				
			}
			index++;
		}
		System.out.println("cumlede " + harf + " harfi "  + count + " defa kullanilmis");
		
		
		
		

	}

}
