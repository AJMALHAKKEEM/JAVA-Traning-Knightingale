import java.util.Scanner;

public class Multiply2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1= reader.nextInt();
		System.out.println("Enter he second number");
		int num2=reader.nextInt();
		int mul=num1*num2;
		
		System.out.println("The multiplication of the two number is : "+mul);
				
	}

}
