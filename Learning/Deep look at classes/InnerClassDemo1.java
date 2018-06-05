
class Outer1{
	int outer_x=10;
	
	void test() {
		Inner1 inner = new Inner1();
		inner.display();
	}
	
	class Inner1{  //because he is inner we don't need to change it's name but did it for nice view
		int y=10;  //local inner class variable
		
		void display() {
			System.out.println("Output outer_x = " + outer_x);
		}
	}
	/*void showy() {
		System.out.println(y); //Error we can't use y here
	}*/
}

public class InnerClassDemo1 {
	public static void main(String args[]) {
	Outer1 outer = new Outer1();
	outer.test();
	}
}
