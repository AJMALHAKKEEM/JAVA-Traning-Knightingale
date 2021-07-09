
public class Sawp2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float first=2.50f ,second=4.50f;
		System.out.println("----befor swap----");
		System.out.println("the first number is "+first);
		System.out.println("the second number is "+second);
		System.out.println("\n****************************\n");
		
		float temp=first;
		first=second;
		second=temp;
		System.out.println("----after swap----");
		System.out.println("the first number is "+first);
		System.out.println("the second number is "+second);
		
	}

}
