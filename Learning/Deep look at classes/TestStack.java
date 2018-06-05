
//Here is 10 members integer stack
class Stack{
	/*Now we have variables stck and tos private so the can't be accessed randomly 
	 * or by wish and be changed and harm our stack 	
	 */
	private int stck[] = new int[10];
	private int tos;
	
	//initialize top of our stack
	Stack() {
		tos=-1;
	}
	
	//Put element in stack
	void push(int item) {
		if(tos==9) System.out.println("Stack is full");
		else stck[++tos]=item;
	}
	
	//Get element from stack
	int pop() {
		if(tos < 0) {
		System.out.println("Stack is empty");
		return 0;
	}
		else return stck[tos--];
	}	
}


public class TestStack {
	public static void main(String args[]) {
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();
		
		//put values in stack
		for (int i=0; i<10; i++) mystack1.push(i);
		for (int i=10; i<20; i++) mystack2.push(i);
		
		//Get values from stack
		System.out.println("Stack mystack1:");
		for (int i=0; i<10; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("Stack mystack2:");
		for (int i=0; i<10; i++)
			System.out.println(mystack2.pop());
		
		//This operators are invalid
		//mystack1.tos=-2;
		//mystack2.stck[3]=100;		
	}
}
