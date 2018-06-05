
class First{
	int i,j;
	First(int a, int b){
		i=a;
		j=b;
	}
	//Show the content of i and j
	void show() {
		System.out.println("i and j: "+i+" "+j);
	}
}

class Second extends First{
	int k;
	Second(int a, int b, int c){
		super(a,b);
		k=c;
	}
	//show content of k with the help of override
	//method show() in First class
	void show() {
		System.out.println("k: "+k);
	}
}

public class OverrideMethod {
	public static void main(String args[]) {
		Second S = new Second(1, 2, 3);
		S.show();//here is called method show() from Second class
		System.out.println("Now will work object with inheretence of method");
		Second1 S1 = new Second1(1, 2, 3);
		S1.show();//here
	}
}

class First1{
	int i,j;
	First1(int a, int b){
		i=a;
		j=b;
	}
	//Show the content of i and j
		void show() {
			System.out.println("i and j: "+i+" "+j);
		}
}
class Second1 extends First1{
	int k;
	Second1(int a, int b, int c){
		super(a,b);
		k=c;
	}
	//This method inherits show() method from super class
		void show() {
			super.show(); //Here calls the show() method from First1 class
			System.out.println("k: "+k);
		}
}

