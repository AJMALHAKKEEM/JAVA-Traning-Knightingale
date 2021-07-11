package week2labwork_loops;

public class SumofArray {

	public static void main(String[] args) {
		
		int array[]= {10,20,30,40,50,60};
		int sum=0;
		for(int num : array) {
			sum+=num;
		}
		System.out.println("the sum of the values of the array is "+sum);
		
	}

}
