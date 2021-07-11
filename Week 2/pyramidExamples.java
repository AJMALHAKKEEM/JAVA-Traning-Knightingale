package week2labwork_loops;

public class pyramidExamples {

	public static void main(String[] args) {
		
		System.out.println("right triangle...........\n");
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//for reverse triangle
		System.out.println("right trianlge upside down.......\n");
		
		
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
