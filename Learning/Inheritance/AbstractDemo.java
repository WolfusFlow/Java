
abstract class AbstractA{
	//This is an abstract method
	abstract void callme();
	
	//Abstract classes can have defined methods
	void callmetoo() {
		System.out.println("This is defined method.");
	}
}
class AbstractB extends AbstractA{
	void callme() {
		System.out.println("Realization of method callme() from class AbstractB.");
	}
}
public class AbstractDemo {
    public static void main(String args[]) {
    	AbstractB B = new AbstractB();
    	B.callme();
    	B.callmetoo();
	}
}
