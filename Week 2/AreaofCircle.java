package week2labwork_loops;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius of the circle.....");
		double radius=scan.nextDouble();
		double area = Math.PI *(radius*radius);
		System.out.println("The area of the circle is "+area);

	}

}
