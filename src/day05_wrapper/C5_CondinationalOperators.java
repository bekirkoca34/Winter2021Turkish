package day05_wrapper;

public class C5_CondinationalOperators {

	public static void main(String[] args) {
	// AND &&, OR || 
	// AND operatoru mukemmelliyetcidir. (ya hep ya hiç)
	
		
		
		
		
		boolean isTrue = 5>4 && 7-3>0;
		
		System.out.println(isTrue);//true
		
		int x= 10;
		int y= 5;
		
		System.out.println(x/y==2 && x*y>20 && x-y>0);//true
		
		System.out.println(x+y<0 && x-y>0);//false
		
		// OR operatoru ise optimisttir, bir dogru bile yeter yeter,,,bitbin
		
		System.out.println(x<y || x+y<0 || x*y > 0);// true
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
