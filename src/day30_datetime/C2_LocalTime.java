package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Iterator;

public class C2_LocalTime {

	public static void main(String[] args) {
		// Java da saat ile islem yapmak icin 
		// LocalTime class' indan obje kullaniriz
		
		
		LocalTime saat= LocalTime.now();
		System.out.println(saat);// 19:38:49.141672400
		
		for (int i = 0; i < 1000000; i++) {
			i+= 1;
			
		}
		LocalTime saat2= LocalTime.now();
		System.out.println(saat2);
		System.out.println(saat);
		
		System.out.println(saat.plusHours(15));// 10:45:50.271759700
		
		System.out.println(saat.getSecond());// 39
		
		System.out.println(saat.minusSeconds(1000));
		
		
		System.out.println(saat.now(ZoneId.of("Japan")));
		System.out.println(saat.now(ZoneId.of("Turkey")));
		System.out.println(saat.now(ZoneId.of("GMT")));

		
	
		
		
		
	}

}
