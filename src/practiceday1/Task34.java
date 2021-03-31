package practiceday1;

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {
		// The marks obtained by a student in 3 different subjects are input by the user.
		// Your program should calculate the average of subjects. 
		// The student gets a grade as per the following rules.

		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter Your Note, Please"); 
	        
	        double notes = scan.nextDouble();
	        
	        if(notes>90 && notes<=100) {
	        	System.out.println("Grade : " + 'A');
	        }else if(notes>=80 && notes<=89) {
	        	System.out.println("Grade : " + 'B');
	        }else if(notes>=70 && notes<=79) {
	        	System.out.println("Grade : " + 'C');
	        }else if(notes>=60 && notes<=69) {
	        	System.out.println("Grade : " + 'D');
	        }else if(notes>=0 && notes<=59) {
	        	System.out.println("Grade : " + 'F');
	        }else {
	        	System.out.println("Enter  A Valid  Note, Please ");
	        }
		
		
		
	}

}
