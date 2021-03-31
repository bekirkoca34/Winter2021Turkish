package day29_passbyvalueimmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {
		/*
		 * Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method
		 * olusturun. - Method’da indirim uygulayip fiyati main method’da yazdirin -
		 * Method’lari arka arkaya cagirip dogru calistiklarini kontrol edin
		 */
		double fiyat = 100;
		System.out.println("%10 indirimli fiyat : " + indirimliUygula10(fiyat));
		System.out.println("%20 indirimli fiyat : " + indirimliUygula20(fiyat));
		System.out.println("%25 indirimli fiyat : " + indirimliUygula25(fiyat));
		System.out.println("method call'dan sonra fiyat : " + fiyat);

	}

	public static double indirimliUygula25(double fiyat) {

		fiyat *= 0.75;
		return fiyat;
	}

	public static double indirimliUygula20(double fiyat) {

		fiyat *= 0.80;

		return fiyat;
	}

	public static double indirimliUygula10(double fiyat) {

		fiyat *= 0.90;

		return fiyat;
	}

}
