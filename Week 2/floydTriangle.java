package week2labwork_loops;

import java.util.Scanner;

public class floydTriangle {

	public static void main(String[] args) {
		int i,j,row,num=1;
 
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the rows of the floyd triangle");
		row =ip.nextInt();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
		
		
	}

}
