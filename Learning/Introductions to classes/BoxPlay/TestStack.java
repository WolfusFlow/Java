
//usage of class Stack
public class TestStack {
	public static void main(String args[]) {	
		
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();
		
		//put numbers in stack
		for (int i=0; i<10; i++) mystack1.push(i);
		for (int i=10; i<20; i++) mystack2.push(i);
		
		//get this numbers from stack
		System.out.println("Numbers of stack 1");
		for (int i=0; i<10; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("Numbers of stack 2");
		for (int i=0; i<10; i++)
			System.out.println(mystack2.pop());
	}
}
