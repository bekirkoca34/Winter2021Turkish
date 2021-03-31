package day39_exceptions;

public class Exceptions07 {

	public static void main(String[] args) {
		// 
		//  Java ClassCastException verir
		
		
		int sayi=10;
		// String str=sayi; CTE
		
		String str="123456";
		System.out.println(str+10);// concat   12345610
		
		int strSayi=Integer.parseInt(str); // parseInt methodu ile String' i int cevirdik, "str yine ayni",,,
		System.out.println(strSayi+10);    //123466 , 
		
		
		String str2="123a45";
		// System.out.println(Integer.parseInt(str2));// NumberFormatException
		
		
		Object sayi2=40;
		// String sayiStr=(String)sayi2;//  Explicit narrowing casting 

	}

}
