package week2labwork_loops;

import java.util.Scanner;

public class areaofRectangle {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the lenghth of the rectangle(in cm)");
		double len =scan.nextDouble();
		System.out.println("Enter the width of the rectangle(in cm)");
		double wid=scan.nextDouble();
		
		double area = len*wid;
		System.out.println("the area of the given rectangle is "+area+" centimeter square");
		
	}

}
