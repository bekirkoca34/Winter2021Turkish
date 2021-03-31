package day51orneksorucoz;

public class Soru1 {

	public static void main(String[] args) {
		

		//soru1
		StringBuilder strBld= new StringBuilder("LearnJava");
		
		//strBld.delete(5,9);
		System.out.println(strBld);
		
		//strBld.insert(0,"You");
		System.out.println(strBld);
		
		strBld.substring(3);
		System.out.println(strBld.substring(3));// syso nun icinde yazdırırsak, "rnJava"yazdirir
		
		strBld.reverse();
		System.out.println(strBld); // StringBuilder dan geldigi icin, tersini yazdirir,  "avaJnraeL"
		
		
		//soru2 
		StringBuilder str=new StringBuilder(7);
		str.append("Java");
		System.out.println(str.capacity()+","+str.length()); // 7,4
		
		
		StringBuilder str1=new StringBuilder("LearnJava");
		str1.deleteCharAt(3);// StringBuilder' den gelen bir ozellik oldugu icin syso icinde yazdirmadan görebiliriz,LeanJava 
		System.out.println(str1.substring(2, 6)); // anJa
		
		str1.setCharAt(4, 'L');
		System.out.println(str1);//LeanLava
		
		System.out.println("=============================================================================");
		//soru
		StringBuilder str2=new StringBuilder("LearnJava");
		int index=str2.indexOf("e",4);
		System.out.println(index);
		
		int index1=str2.indexOf("a", 4);
		System.out.println(index1);
		
		
		
		

	}

}
