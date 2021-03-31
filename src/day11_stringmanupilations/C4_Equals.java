package day11_stringmanupilations;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2 'yi karsilastirip ve String olarak esit olup olmadiklarina bakar
		// sonuc olarak true veya false döndürür(return).
		
		// bazi methodlarin yaptikleri islem ile döndurdukleri(return) sonuc farkli olabilir.
		// bir methoda gir ali ismindeki elementi sil deriz;
		// o da gidip ali' yi bulur ve siler
		// 
		
		String str="Ali can";
		String str2="Ali Can";
		
		// str ile str2 nin esit olup olmadigini karsilastirn
		
		System.out.println(str.equals(str2));// true
		
		System.out.println(str.equals(str2) ? "Esit" : "Esit degil");
		
		// Java ' da String'ler case sensitive'dir. ***
		
		
		
		
		
		
		

	}

}
