
class OuterF{
	int outer_x=100;
	
	void test() {
		for (int i=0; i<10;i++) {
			class Inner{
				void display() {
					System.out.println("Output: outer_x = "+outer_x);
				}
			}
			Inner inner = new Inner();
			inner.display();
		}
	}
}

public class InnerClassInFor {
	public static void main(String args[]) {
		OuterF outer = new OuterF();
		outer.test();
	}
}
