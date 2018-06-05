
//Demonstrating the use of variable length arguments
public class VarArgs {
	//Now vaTest() is declared with variable length arguments.
	static void vaTest(int ... v) {
		System.out.print("Quantity of arguments: "+v.length+" Content: ");
		
		for (int x:v)
			System.out.print(x+" ");
		System.out.println();
	}
	public static void main (String args[]) {
		//Note the possible ways to call a method vaTest() with variable length arguments
		vaTest(10);
		vaTest(1,2,3);
		vaTest();
	}
}
