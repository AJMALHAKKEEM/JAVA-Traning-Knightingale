package week2labwork_loops;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		
	Scanner hi=new Scanner(System.in);
	System.out.println("Enter the number to be checked");
	int num = hi.nextInt();
	int count=0;
	for(int i=num;i>=1;i--) {
		if(num%i==0) {
			count+=1;
			
		}
		
	}
	if(count==2)
		System.out.println(" the number is a prime......");
	else
		System.out.println("the number is not prime number..........");
	//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
	

	}

}
