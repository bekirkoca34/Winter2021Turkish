package day12_stringmanupilation;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		// interview sorusu gelebilir

		
		String str1="Ali Can";
		String str2=str1+ "";// Ali Can
		
		System.out.println(str1==str2);
		// == Stringlerin hem degerlerine hem de adreslerine bakar
		// bu ornekte str1+" yazdigimizda concationation yapidigi icin Java yeni bir obje 
		// olusturur ve islemin sonucunu yeni objenin icine koyar.
		// str1 ve str2' yi karsilastirisak degerleri ayni adresleri farkli oldugu için false döner 
		
		
		System.out.println(str1.equals(str2));
		// equals() methodu sadece String'lerin degerlerini karsilastirir.
		// bu ornekte str1 ve str2 degerleri AYNI oldugu icin TRUE dondurur.
		
		String str3=str1;
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
		
	}

}
