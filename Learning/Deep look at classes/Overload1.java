
public class Overload1 {
	public static void main(String args[]) {
		OverloadDemo1 ob = new OverloadDemo1();
		int i = 88;
		
		
		ob.test();		
		ob.test(11,22);
		
		ob.test(i);  //here calls variant of method test(double)
		ob.test(123.2); //and here calls variant of method test(double)
		//auto type transformation available only if compiler couldn't found such parameter
	}
}
