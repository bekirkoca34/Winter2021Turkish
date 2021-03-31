package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C5_ForEachLoop5 {

	public static void main(String[] args) {
		// Bir integer list olusturunuz
		// bu list deki tum sayilarin karesinin toplamini
		// For each loop kullanarak bulunuz
		
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(3);
		list.add(8);
		System.out.println(list);
		
		int karelerTop=0;
		
		
	   for (Integer each : list) {
		    
		   karelerTop+=each*each;
		   
	}
	   	
		System.out.println(karelerTop);
		

	}

}
