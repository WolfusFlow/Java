
public class Overload {
	public static void main(String args[]) {
		OverloadDemo ob = new OverloadDemo();
		double result;
		
		//evoke all variants of test() method
		ob.test();
		ob.test(10);
		ob.test(10,20);
		result = ob.test(123.25);
		System.out.println("Result of ob.test(123.25): "+result);
	}
}
