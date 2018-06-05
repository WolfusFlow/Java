
class Construct1{
	Construct1(){
		System.out.println("This is construct1.");
	}
}
class Construct2 extends Construct1{
	Construct2(){
		System.out.println("This is construct2.");
	}
}
class Construct3 extends Construct2{
	Construct3(){
		System.out.println("This is construct3.");
	}	
}
public class QueueOfConstruct {
	public static void main(String args[]) {
		Construct3 Queue = new Construct3();
	}
}
//As we can see constructs are called in the order of inheritance.
