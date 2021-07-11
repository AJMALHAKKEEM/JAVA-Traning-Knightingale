package week2labwork_loops;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num,reverseNum=0;
		System.out.println("enter the number to be reversed...");
		num=scan.nextInt();
		
		while(num!=0){
			reverseNum*=10;
			reverseNum+=(num%10);
			num/=10;
		}
		
		System.out.println("the reverse of the entered number "+reverseNum);
	}

}
