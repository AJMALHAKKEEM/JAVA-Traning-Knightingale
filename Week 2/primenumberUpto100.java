package week2labwork_loops;

public class primenumberUpto100 {

	public static void main(String[] args) {
		int  c;
		String primeNUmber ="";
		
		for(int i=0;i<+100;i++) {
			int counter=0;
			for(c=i;c>=1;c--) {
				if(i%c==0)
					counter+=1;
				
			}
		if(counter==2)
			primeNUmber= primeNUmber + i+ " ";
		}
		System.out.println("prime numbers from 1 to 100\n"+ primeNUmber);
	}

}
