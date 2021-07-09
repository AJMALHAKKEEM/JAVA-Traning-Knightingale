import java.util.Scanner;

public class QuotientandReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the divident value");
		int div = s1.nextInt();
		System.out.println("enter the divisor value");
		int dis =s1.nextInt();
		int quo=div/dis;
		int rem=div%dis;
		System.out.println("the quotient of the divition is "+quo);
		System.out.println("the reminder of the division is "+rem);
		
	}

}
