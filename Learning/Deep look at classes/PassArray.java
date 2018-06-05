
//Use an array to pass to the method a variable number of arguments. 
//This is an old approach to handling variable length arguments.
public class PassArray {
	static void vaTest(int v[]) {
		System.out.print("Quantity of arguments: "+v.length+" Content: ");
		
		for (int x: v)
			System.out.print(x+" ");
		System.out.println();
	}
	public static void main(String args[]) {
		//Take attention on an order of creating array for storage arguments
		int n1[]= {10};
		int n2[]= {1,2,3};
		int n3[]= {};
		
		vaTest(n1);//First argument
		vaTest(n2);//Three argument
		vaTest(n3);//No argument
	}

}
