package practiceday1;

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		// Write a java program that will accept two number 
		// and check if two numbers are equal or not
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number, Please");
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		if(num1==num2) {
			System.out.println("Two number is equal");
		}else {
			System.out.println("Two number is not equal");
		}
			
		
		

	}

}
