
//Use variable length arguments along with standard arguments
public class VarArgs1 {
	
	//msg is a simple parameter
	//v is a variable length parameter
	static void vaTest(String msg, int ... v) {
		System.out.print(msg+v.length+" Content: ");
		
		for (int x:v)
			System.out.print(x+" ");
		
		System.out.println();
	}
	public static void main(String args[]) {
		vaTest("One parameter of variable length: ", 10);
		vaTest("Three parameters of variable length: ", 1, 2, 3);
		vaTest("No parameters of variable length: ");
	}
}
