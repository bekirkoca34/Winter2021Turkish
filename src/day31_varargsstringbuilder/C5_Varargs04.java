package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		// toplam(list); varargs esnek oldugu icin liste benzese de list degildir.
		
		int arr[]= {15,20,25};
		// toplama(arr);// Varargs array olarak calisir ve argument olarak array yollanabilir.
		
		
		// kullanicidan deger olarak varargs calistirmak istiyorsak
		// girilen degerleri bir array'e kaydetmeliyiz
		// bubnun icin kullanicidan aldigimiz degerleir esnek oldugu icin bir list' e koyariz
		// sonra list'i array'e ceviririz
		
		
		
		
		

	}

	public static void toplama(int sayi, int... var) {// data turunden sonra yazdigimiz ... varargs kullanacagız
		// anlamina gelir
            System.out.println("Varargs'a dahil olmayan argument : " + sayi);

          int toplam=0;

          for (int each : var) {
         toplam+=each;

}
            System.out.println(toplam);

	
	
	
	
	

}
	}
