
//Upgraded class Stack in which we use member of array length
class Stack1{
	private int stck[];
	private int tos;
	
	//initialize and take memory for stack
	Stack1(int size){
		stck = new int[size];
		tos=-1;
	}
	
	//put elements in stack
	void push(int item) {
		if (tos==stck.length-1)  //using member of length of array
			System.out.println("Stack is full.");
		else
			stck[++tos]=item;
	}
	
	//get elements from stack
	int pop() {
		if(tos<0) {
			System.out.println("Stack is empty.");
			return 0;
		}
		else return stck[tos--];
	}
}

public class TestStack1 {
	public static void main(String arg[]) {
		Stack1 mystack1 = new Stack1(5);
		Stack1 mystack2 = new Stack1(8);
		
		//put numbers in stack
		for(int i=0; i<5; i++) mystack1.push(i);
		for(int i=0; i<8; i++) mystack2.push(i);
		
		//Get numbers from stack
		System.out.println("Stack mystack1:");
		for (int i=0; i<5; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("Stack mystack2:");
		for (int i=0; i<8; i++)
			System.out.println(mystack2.pop());
		
		
	}
}
