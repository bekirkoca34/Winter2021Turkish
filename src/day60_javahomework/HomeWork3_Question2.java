package day60_javahomework;

import java.util.Scanner;

public class HomeWork3_Question2 {

	public static void main(String[] args) {


		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen is unvaninizi giriniz");
		String jobTitle=scan.next().toLowerCase();
		
		/*if (jobTitle=="qa") {
			System.out.println("is unvaniniz Quality Analyst");
		}else if(jobTitle=="dev"){
			System.out.println("is unvaniniz Developer");
		}else if(jobTitle=="ba") {
			System.out.println("is unvaniniz Business Analyst");
		}else if(jobTitle=="pm") {
			System.out.println("is unvaniniz Project Manager");
		}else {
			System.out.println("Lutfen gecerli bir unvan giriniz");
		}
		*/
		
		switch(jobTitle) {
        case "qa":
        	System.out.println("is unvaniniz Quality : Analyst");
        	break;
        case "dev":
        	System.out.println("is unvaniniz : Developer");
        	break;
        case "ba":
        	System.out.println("is unvaniniz : Business Analyst");
        	break;
        case "pm":
        	System.out.println("is unvaniniz : Project Manager");
            break;
        default:
            System.out.println("lutfen gecerli bir unvan giriniz");
        }
		

	}

}
