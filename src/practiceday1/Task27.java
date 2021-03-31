package practiceday1;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		// write a java program to implement following logic using if statement 
		// 1) if hour is less than 12 noon, greet with Good Morning,
		// 2) if hour is greater than or equal 12 but less than 3 pm, greet with Good Afternoon
		// if hour is greater than or equal to 3 pm, greet with Good Evenig.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter hour, Please");
		
		double hour=scan.nextDouble();
		
		if(hour<12 && hour>3) {
			System.out.println("Good Mornig");
		}else if(hour>=12 && hour<15) {
			System.out.println("Good Afternoon");
		}else if(hour>=15 && hour<22) {
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
		}

		
		
		
		
		

	}

}
