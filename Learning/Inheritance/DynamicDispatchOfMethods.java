
class aa{
	void callme() {
		System.out.println("Method callme() from a class");
	}
}
class bb extends aa{
	void callme() {   //redefine method callme()
		System.out.println("Method callme() from b class");
	}
}
class cc extends aa{
	void callme() {   //redefine method callme()
		System.out.println("Method callme() from c class");
	}
}
public class DynamicDispatchOfMethods {
	public static void main(String args[]) {
		aa aobj = new aa();   
		bb bobj = new bb();
		cc cobj = new cc();
				
		aobj.callme();
		bobj.callme();
		cobj.callme();
		System.out.println();
		
		aa rr;       //get link on aa object
		
		rr=aobj;     //rr linking on object aa type
		rr.callme(); //call method callme()
		
		rr=bobj;     //rr linking on object bb type
		rr.callme(); //call method callme()
		
		rr=cobj;     //rr linking on object cc type
		rr.callme(); //call method callme()
}
} 