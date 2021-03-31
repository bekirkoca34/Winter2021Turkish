package javapracticeday05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Soru05 {

	public static void main(String[] args) {
		/* verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
		   not kisa metodlar kullamayiniz
          Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
        */
		
		
		int arr[]= {2,5,3,9,8,12,6,7,4,11};
		int n=4;
		
		// bir list olusturalım
		
		List<Integer> list= new ArrayList<>();
		// list elemanlarini eklemek icin foreach loop kullanalim,
		
		for (int  each : arr) {
			list.add(each);
		}
		
		List<Integer> newList= new ArrayList<>();
		int count = 0;
		while (count<=n) {
			
			int max=list.get(0);// max= listin ilk elamani
			
			for(int i= 0; i< list.size(); i++) {
				if(list.get(i)> max) {
					max=list.get(i);
				}
			}
			
			newList.add(max);
			list.remove(list.indexOf(max));
			count++;
			
		}
		System.out.println("Arrayin ilk " + n + " max degerleri " + newList);
		
	}

}
