package week2labwork_loops;

import java.util.Scanner;

public class switchCase {
	public static void main(String[] args) {
		
		Scanner ss =new Scanner(System.in);
		System.out.println("enter the tech number b/w 1-3 ");
		int tech= ss.nextInt();
		
		
		switch(tech) {
		case 1 :{
			System.out.println("python.....");
			break;
		}
		case 2 :{
			System.out.println("java......");
			break;
		}
		case 3 :{
			System.out.println("c++.......");
			break;
		}
		default :{
			System.out.println("invalid input.....");
		}
		}
		
		
		
		
		
		
	}

}
