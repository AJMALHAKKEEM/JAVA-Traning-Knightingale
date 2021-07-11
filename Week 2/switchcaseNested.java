package week2labwork_loops;

import java.util.Scanner;

public class switchcaseNested {

	public static void main(String[] args) {
		int tech,course;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the tech code.....1-3");
		tech=scan.nextInt();
		
		
		switch(tech) {
		case 1 :{
		
			System.out.println("the tech is python");
			
			System.out.println("enter the course code 1 or 2");
			course = scan.nextInt();
			switch(course){
				case 1 :{
					System.out.println("basics........");break;
				}
				case 2 :{
					System.out.println("advanced.......");break;
				}
				default:{
					System.out.println("invalid input.....");
				}
			}break;
		}
			case 2 :{
				

				System.out.println("the tech is java......");
				
				System.out.println("enter the course code 1 or 2");
				course = scan.nextInt();
				switch(course){
					case 1 :{
						System.out.println("basics........");break;
					}
					case 2 :{
						System.out.println("advanced.......");break;
					}
					default:{
						System.out.println("invalid input.....");
					}
				}break;
				}
			 default:{
				 System.out.println("invalid input");
			 }
		
		}
		


	}

}
