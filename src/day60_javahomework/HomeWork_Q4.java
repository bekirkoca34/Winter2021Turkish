package day60_javahomework;

import java.util.Scanner;

public class HomeWork_Q4 {

	public static void main(String[] args) {
		/* 
		Kullanicidan 3 tane pozitif  tam sayi alalim
		bu uc sayidan ucgen olup olmama durumunu kontrol edelim
		eger ucgen olabiliyor ise, es kenar ucgen mi kontrol edelim.
       */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");	
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
        
        
        if ((b+c>a) && (a>b-c) && (a+c>b) && (b>a-c)  && (a+b>c && c>a-b)) {
			System.out.println("Sadece ucgen");
		} else {
           System.out.println("Ucgen degil");
		} if(a==b && a==c) {
			System.out.println("eskenar ucgen");
		}else {
			System.out.println("eskenar ucgen degil");
		}
        

	}

}
