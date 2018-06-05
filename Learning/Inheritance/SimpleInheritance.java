
/*Simple example of Inheritance
  Create a super class*/
class A{
	int i,j;
	void showij() {
		System.out.println("i and j: "+i+" "+j);
	}	
}

//Create subclass by extending the A class
class B extends A{
	int k;
	
	void showk() {
		System.out.println("k: "+k);
	}
	
	void sum() {
		System.out.println("i+j+k: "+(i+j+k));
	}
}

public class SimpleInheritance {
	public static void main(String args[]) {
		A superOb = new A();
		B subOb = new B();
		
		//Superclass can be used independently
		superOb.i=10;
		superOb.j=20;
		System.out.println("Content of superOb object: ");
		superOb.showij();
		System.out.println();
		
		//Subclass have access to all open members of his superclass
		subOb.i=7;
		subOb.j=8;
		subOb.k=9;
		System.out.println("Content of subOb object: ");
		subOb.showij();
		subOb.showk();
		
		System.out.println();
		System.out.println("Amount of i, j and k in object subOb: ");
		subOb.sum();
		
	}
}

//private variables are not accessible in subclass 
//because private is works only in private variable class


