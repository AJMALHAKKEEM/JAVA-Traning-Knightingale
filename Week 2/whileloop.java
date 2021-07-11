package week2labwork_loops;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		
		// while loop
		Scanner ip=new Scanner(System.in);
		int sum=0;
		System.out.println("enter a number less than 10");
		byte n=ip.nextByte();
		
		while(n<=10) {
		
			sum += n;
			n++;
		}
		System.out.format("the sum output of the while loop is: %d",sum);
		System.out.println();
		
		
		
		// do while loop
		
		int i = 2;
		
		do {
			System.out.print("the value of i is "+ i +"\n");
			
			i++;
			
		}while(i<12);
			
			
			
			
		}
		
		

	}


