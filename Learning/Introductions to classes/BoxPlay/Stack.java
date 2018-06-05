
//here is an integer 10 members stack

public class Stack {
	int stck[]= new int[10];
	int tos;
	
	//initialize top of stack
	Stack(){
		tos = -1;
	}
	
	//put element in stack
	void push(int item) {
		if( tos == 9)
			System.out.println("Stack is full.");
		else
			stck[++tos]=item;
	}
	
	//take element out of stack
	int pop() {
		if(tos<0) {
			System.out.println("Stack is empty.");
			return 0;
		}
		else
			return stck[tos--];
	}

}
