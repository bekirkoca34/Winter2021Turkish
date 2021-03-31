package day03_datacasting;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		// double bir degisken olusturalım int ve sonrada byte cevirelim
		
		double numDouble=280.56;
		
		int numInt= (int) numDouble; 
		// () parantez icine int yazarak 
		// javanın sikayetini cozuyoruz.sorumluluk bende diyoruz
		// double dan integer a gecerken eger sayıda ondalıklı bolum varsa 
		// java ondalık kısmı atar.
		
		
		System.out.println("integer degisken degeri : " + numInt);
		
		byte numByte= (byte) numInt;
		// daha dar bir (narrow) data tipine cevirirken eger data tipinin sinirinidan buyukse saymaya devam 
		// eder negatif en kucuk sayıdan devam eder, istene sayıya gelinciye kadar.
		System.out.println("byte degisken degeri : " + numByte);
		
		
		
		
		
		
		
		
		
		
		

	}

}
