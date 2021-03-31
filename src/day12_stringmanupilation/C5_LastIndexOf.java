package day12_stringmanupilation;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		// kullanicidan bir cumle alin 
		// asagidaki uc durumdan uygun olani yazdirin
		// 1 cumle java icermiyor
		// 2 cumle 1 tane java iceriyor
		// 3 cumlede birden fazla java var
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine().toLowerCase();
		
		
		int ilkJava=cumle.indexOf("java");//-1  yada ilk java nin indexini,
		int sonJava=cumle.lastIndexOf("java");// -1 yada son java nın indexini,
		
		if (ilkJava==-1) {
			System.out.println("cumle java icermiyor");
		}else if(ilkJava==sonJava) {
			System.out.println("cumle bir java iceriyor");
		}else {
			System.out.println("cumle birden fazla java iceriyor");
		}
		

		
	}

}
