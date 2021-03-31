package day14_methodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		// verilen 3 double sayinin ortalamsini alan bir method yazin
		// main method icinden cagirarak methodu yazdirin

		ortalama(12, 56);
		ortalama(12, 56, 7);

	}

	public static void ortalama(double sayi1, double sayi2, double sayi3) {

		System.out.println("girdiginiz iki sayinin ortalamasi :" + (sayi1 + sayi2 + sayi3) / 3);

	}

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdiginiz iki sayinin ortalamasi :" + (sayi1 + sayi2) / 2);
		// Bir methodu olusturmak o methodu calistirmak icin yeterrli degildir.
		// Olusturulan method main method icinden cagrilinca calisir
	}
	
	
	
	
	

}
