package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		// istedigimiz kadar sayi girdigimizde tum sayiyalri toplayan bir method yazalim
		// var-----variety cesitlilik args---arguments
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
		

	}

	public static void toplama(int... var) {// data turunden sonra yazdigimiz ... varargs kullanacagız anlamina gelir
		int toplama=0;
		for (int j : var) {
			toplama+=j;
		}
		
		System.out.println("toplama : " + toplama);
		
	}

}
