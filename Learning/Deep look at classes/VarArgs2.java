
//Arguments of variable length and overflow
public class VarArgs2 {
	static void vaTest(int ... v) {
		System.out.print("vaTest(int ...): "+
	"Amount of elements: "+v.length+" Content: ");
		
		for (int x:v)
			System.out.print(x+" ");
		System.out.println();
	}
	static void vaTest(boolean ... v) {
		System.out.print("vaTest(boolean ...): "+
				"Amount of elements: "+v.length+" Content: ");
		
		for (boolean x:v) 
			System.out.print(x+" ");
		System.out.println();				
	}
	static void vaTest(String msg, int ...v) {
		System.out.print("vaTest(String, int ...): "+ msg
				+v.length+" Content: ");
		
		for (int x:v) 
			System.out.print(x+" ");
		System.out.println();				
	}
	public static void main(String args[]) {
		vaTest(1,2,3);
		vaTest("Check: ", 10,20,30);
		vaTest(true,false,false);
	}
}
