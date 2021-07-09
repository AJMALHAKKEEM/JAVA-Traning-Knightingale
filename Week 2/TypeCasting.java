
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=25;
		int u=b;
		System.out.println(u);
	//	byte c=u; /*this would throw an error becasue int can't be saved into byte due to type mismatch*\
	//	System.out.println(C);
		byte d=(byte)u;  //in order to overcome the previous error tpye casting is used (NB:In type casting precision will be affected
		System.out.println(d);
		byte x=10;
		byte y=20;
		byte z=(byte)(x+y);//here type casting is used becuase addtion of two variable of byte type would result in int type
		System.out.println(z);
		
	}

}
