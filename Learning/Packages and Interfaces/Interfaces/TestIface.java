package Interfaces;


interface CallBack{
	void callback(int param);
}
class Client implements CallBack{
	public void callback(int p) {
		System.out.println("Method callback(), called with parameter "+p);
	}
	
	void nonIfaceMeth() {
		System.out.println("In classes that realize interfaces"
				+ "the other members can be initialized as well");
	}
}
public class TestIface{
	public static void main(String args[]) {
		CallBack c = new Client();
		c.callback(42);
	}
}
