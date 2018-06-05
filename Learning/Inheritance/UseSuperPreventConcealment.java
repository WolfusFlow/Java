
class A1{
	int i;
}

class B1 extends A1{
	int i; //this member i hides member i from A1 class
	
	B1(int a, int b){
		super.i= a;
		i=b;
	}
	void showij() {
		System.out.println("Member i in Superclass: " + super.i);
		System.out.println("Member i in Subclass: " + i);
	}
}
class UseSuperPreventConcealment {
	public static void main(String args[]) {
		B1 subOb = new B1(1,2);
		subOb.showij();
	}
}
