
class r{
	int i,j;
	r(int a, int b){
		i=a;
		j=b;
	}
	void show(){
		System.out.println("i and j "+i+" "+j);
	}
}
class f extends r {
	int k;
	f(int a, int b, int k){
		super(a,b);
		this.k = k;
	}
	void show(String msg) {   //overload method
		System.out.println(msg +k);
	}
}
public class OverloadedMethodInInheritance {
	public static void main(String args[]) {
		f obj = new f(1,2,3);
		
		obj.show("it's k: "); //this is f class method
		obj.show();			  //this is r class method
	}
}
