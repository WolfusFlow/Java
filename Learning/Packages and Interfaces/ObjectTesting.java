
class A{
	double s,d,k;
	A(double s, double d, double k){
		this.s=s;
		this.d=d;
		this.k=k;
	}	
}
class B extends A{
	B(double s, double d, double k){
		super(s,d,k);
	}
}
public class ObjectTesting {
	public static void main(String args[]) {
				
		A a = new A(2,3,4);
		A ar = a;
		
		
		Object object = new Object();
		boolean k = object.equals(a); //Let's compare this objects
		System.out.println("Let's check if out 2 objects are equal "+k);
		boolean l = ar.equals(a); //again comparing
		System.out.println("And again "+l);
		
		//Test hashCode working
		int h;
		h=object.hashCode(); //let's know what's hash of this object
		System.out.println("The hash of object is "+h);
		
		//Let's try convert to string thing
		a.toString();		
		System.out.println("Hmm that was a \"description of class\"(convertation to string)");
		System.out.println("Try this again but with main contained class "+ObjectTesting.class.toString());
		B B = new B(4,7,8);
		System.out.println("Let's try to do this strange thing with toString agains "+B.toString());
				
	}
}
