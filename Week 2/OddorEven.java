import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n1=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=n1.nextInt();
		System.out.println((num%2==0)? "the given number is Even" : "the given number is Odd");
				

	}

}
