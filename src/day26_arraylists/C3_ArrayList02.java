package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		// List'in uzunlugu nasil bulunur
		List<Integer> list= new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
		System.out.println(list);// [10, 15, 8, 12,20]
		
		System.out.println(list.size());
		
		// bir eleman nasil silinir
		
		list.remove(1);// [10, 8, 12, 20]
		System.out.println(list);
		
		
		System.out.println(list.remove(2));// git 12 kaldir dedik, bize 12'yi döndürür
		// remove(index) kullandigimizda o indexdeki elemani remove eder
		// ve bubnun delili olarak bize o elemani getiri
		// eger olmayan bir index girersek RTE verir
		System.out.println(list);
		
		List<String> list2 = new ArrayList<>();
		list2.add("Ali");
		System.out.println(list2.remove("Hasan"));// git Hasan ı kaldir dedik, bulamadıgı icin false döndürür
		System.out.println(list2);
		
		// remove (object) methodu kullanildiginda eger Java istenen elemani bulup romeve ederse 
		// bize true dondurur, listede bulmazsa istegi yerine getiremedigini anlamamiz icin false dondurur
		
		
		
		
		
	}

}
