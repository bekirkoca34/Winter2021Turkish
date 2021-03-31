package practiceday1;

import java.util.Scanner;

public class Practice_IfStatements {

	public static void main(String[] args) {
		// write a java program:
		// 1) declare a variable and initialize user age.
		// 2) a person who is eligible to vote must be older than or equal to 18 years old.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter three number, Please");
		
		//int years=scan.nextInt();
		
		//if(years>=18) {
		//	System.out.println("You are eligible to vote");
		

		
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if(num1>num2 && num2>num3) {
			System.out.println("The num1 is greatest number");
		}else {
			System.out.println("the num1 is not greatest number");
		}
		
		
		
		
		
		

	}

}
