package day14_methodCreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		
		
		String str="Java cok guzel";
		
		//1) Java methodlarin sadece ismine degil, isim + parametre'lere bakar
		// Sadece parametre sayisi degil parametre'lerin data tiplerine de bakar.
		str.endsWith("el"); // Bu methodun gorevi gidip kelimenin son kismini kontrol etmek
		                    // Bu methodu kullanmak icin bu methodu kontrol etmek ettikten sonra bana rapor olrak 
		                    // ne getirdigini bilmem lazim()true/false
		
		//2) Bir method olusturdugumuzda methodun ne yapacigina ve gorevi yaptiktan sonra bana ne 
		// dondurecegine basten kara vermeliyiz
		
		// 3) Bir method olusturulurken "str.indexOf("va", 1);" oldugu gibi disaridan kabul edecegi parametreleri 
		// ve bu parametrelerin data tiplerini deklare etmeliyiz.
		
		// Methodu calıstırmak istedigimde (Method' u cagirmak) Parametre olarak declare edilen data tiplerine uygun 
		// degerlere ARGUMENT denir.
		
		str.indexOf("va", 1);
		
		
		
		
		
		
		

	}

}
