
//Objects passed by their links
class Test2{
	int a,b;
	
	Test2(int i, int j){
		a=i;
		b=j;
	}
	
	//Transfer object
	void meth(Test2 o) {
		o.a *= 2;
		o.b /= 2;
	}	
}

public class PassObjRe {
	public static void main(String args[]) {
		Test2 ob = new Test2(15,20);
		
		
		System.out.println("ob.a and ob.b before calling them: "+ob.a+" "+ob.b);
		
		ob.meth(ob);		
		System.out.println("ob.a and ob.b after calling them: "+ob.a+" "+ob.b);
	}
}