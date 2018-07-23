
public class rect {
	public static void main(String[] args) {
		tri t = new tri(2,3,5);
		four f = new four(3,5,6);
		
		System.out.println(t.form());
		if (f.d==0){
			System.out.println(f.out());
		}else {
			
		}
	}

}
class tri{
	double a,b,c;
	tri (){
		//empty		
	}
	tri (double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;		
	}
	double form(){
		return a*b*c;
	}
	
}
class four{
	double a,b,c,d;
	String s="one missing";
	four(double a, double b, double c, double d){
		this.a =a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	four(double a, double b, double c){
		this.a =a;
		this.b=b;
		this.c=c;
		
	}
	String out() {
		
		return s;
	}
}

