package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
	  
		
		List<String> list= new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		
		System.out.println(list);//[Ali, Can, Ayse, Fatma]
		
		System.out.println(list.size());// 4
		
		// list.remove(1); indexi 1 olan Can'i silip, sildigi elemani bana döndürecek
		System.out.println(list.remove(1));
		System.out.println(list); // [Ali, Ayse, Fatma]
		
		System.out.println(list.remove("Ayse"));// Ayse' yi silecek ve bize true döndurecek
		System.out.println(list);               // [Ali, Fatma]
		
		System.out.println(list.remove("Mehmet"));// Mehmet i bulamadugı icin silemeyecek ve bize false yazar
		System.out.println(list); // [Ali, Fatma]
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
