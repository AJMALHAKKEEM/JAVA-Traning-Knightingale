import java.util.Scanner;

public class Largestamong3Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1 = s1.nextInt();
		System.out.println("enter the second number");
		int num2 = s1.nextInt();
		System.out.println("enter the last number");
		int num3 =s1.nextInt();
		
		if(num1>=num2&&num1>=num3)
			System.out.println("the largest number is "+num1);
		else if(num2>=num1&&num2>=num3)
			System.out.println("the largest number is "+num2);
		else
			System.out.println("the largest number is "+num3);
		

	}

}
