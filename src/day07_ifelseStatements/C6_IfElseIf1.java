package day07_ifelseStatements;

import java.util.Scanner;

public class C6_IfElseIf1 {
public static void main(String[] args) {
	
	//kullanicidan 100 uzerinden notunu isteyin.
	//notu harf sisteminne cevirip yazdirin.
	//50 den kucuk "d" 50-60 arası "C", 60-80 arası "B", 80 uzeri "A"
	
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Lutfen notunuzu giriniz");
	
	double not= scan.nextDouble();
	
	if (not<0 || not> 100) {// istenmeyen durum
		System.out.println("Lutfen gecerli bir not giriniz");
		
	} else if(not<50){// notumuz 0 ile 100 arasinda
      System.out.println("notunuz : D");
	}else if(not<60){// not 50 ile 100 arasindadir
		System.out.println("notunuz : C");
	}else if (not<80){// not 60 ile 100 arasindadir
		System.out.println("notunuz : B");
	} else if (not<100){//not 80 ile 100 arasinda
		System.out.println("notunuz : A");
	}else {
		System.out.println("tekrar deneyiniz");
	}
	
	
	scan.close();
	
	
	
	
	
}
}
