package week2labwork_loops;

import java.util.Scanner;

public class AreaofsquareandTriangle {

	public static void main(String[] args) {
		// Area of square.....
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the one side of the square..(in meter)");
		double side = scan.nextDouble();
		
		double area=side*side;
		System.out.println("The area of the square is "+area+" meter square\n");
		
		//area of triangle
		System.out.println("**********************************************************\n");
		Scanner n1=new Scanner(System.in);
		System.out.println("Enter the height of the triangle");
		double height =scan.nextDouble();
		System.out.println("Enter the breadth of the triangle");
		double breadth=scan.nextDouble();
		double areaTriangle=(height*breadth)/2;
		System.out.println("The area of the give Triangle....."+ areaTriangle);
	}

}
