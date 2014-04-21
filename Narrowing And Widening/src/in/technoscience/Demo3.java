package in.technoscience;

public class Demo3 {
	public static void main(String as[]) {
		byte b1 = 10;
		Short s1= 14;
		long l1= 18;
		int intType = 15;
		intType= b1;
		intType= s1;
	//	intType= l1; // compiler unhappy
		intType=(int)l1;
	//	float f= 30.0; // compiler unhappy
		
		float fv= 30.4f;
		float fv1=(float)30.0;
		//intType=fv;// compiler unhappy
		intType=(int) fv;
		System.out.println(intType);
		// same will happen in case of double also
		
		//byte b2 = b1+2; // compiler unhappy
		byte b3 = (byte) (b1 + 2);
		System.out.println(b1);
		System.out.println(b3);
		
		float f1 = 10.0f;
		float f2 = (float) (100.4 / f1);
		float f3 = (float)(f1-0.0);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

	}

}
/*output :
	10
	12
	10.0
	10.04
	10.0
*/
	