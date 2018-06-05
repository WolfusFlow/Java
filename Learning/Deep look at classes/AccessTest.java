
//Let's try public and private modificators

class Testi{
	int a;            //default
	public int b;     //open access
	private int c;    //close access
	
	//methods for access c of this class
	void setc(int i) {   //set value of c for this class
		c=i;
	}
	int getc() {   //get c of this class
		return c;
	}
}


public class AccessTest {
	public static void main(String args[]) {
		Testi ob = new Testi();
		
		//this operators are correct so a and b are accessible primarily
		ob.a=10;
		ob.b=20;
		
		//this operator incorrect and can drop a error
		//ob.c = 100; // Error!
		
		//If we want to access c we need to do it throw the methods of it's class
		ob.setc(100);//Correct!
		System.out.println("a,b, and c: "+ ob.a + " "+ ob.b+ " "+ ob.getc());
		
	}

}
