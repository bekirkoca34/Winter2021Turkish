package day03_datacasting;

public class C3_DataCasting {

	public static void main(String[] args) {
		// byte veri turunden bir degisken olusturup deger atayın
		//  alusurulan variable'i adım adım AUTO WİDENİNG ile genisletip yazdirin
		
		byte numByte= 34;
		
		System.out.println("byet degisken degeri :"+ numByte);
		
		
		// short yapalım
		
		short numShort= numByte;// short byte dan buyuk oldugu icin java sikayet etmiyor
		
		System.out.println("short değisken degeri :" + numShort);

		int numInt= numShort;
		System.out.println("Integer degisken degeri : " + numInt);
		
		float numFloat= numInt;
		System.out.println("float degisken degeri : " + numFloat);
		
		double numDouble= numFloat;
		System.out.println("double degisken degeri :" + numDouble);
		
		
		
		
		
		
		
		
		
		
		
		
	} 

}
