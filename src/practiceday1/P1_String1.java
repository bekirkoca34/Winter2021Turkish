package practiceday1;

public class P1_String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="3+5";
		System.out.println(str);
		
		String birSiir=" Neler yapmadik bu vatan icin \n Kimimiz olduk \n Kimimiz nutuk soyledik\n O.V.Kanik";
		
		System.out.println(birSiir);
		
		// casting 
		short i;
		short j;
		
		j= 6000;
		i=(short)j;
		System.out.println(i);
		
	    int x=5;
	    int y=10;
	    
	    System.out.println("x+y :" +(x+y));
	    System.out.println("x*y :" + ( x*y));
	    System.out.println("y/x :" + (y/x));
	    System.out.println("y-x :" + (y-x));
		
	    
	    System.out.println("x++ : "+ x++);
		System.out.println("y++ : "+ y++);
	}

}
