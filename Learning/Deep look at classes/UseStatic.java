
//Example of static variables
public class UseStatic {
	static int a =3;
	static int b;
	
	static void meth(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	static {
		System.out.println("Static block was initialized.");
		b=a*4;
	}
	public static void main(String args[]) {
		meth(42);
		Staticbyname.StaticByname();
		System.out.println("d= "+StaticDemo.d);
	}
	
	/*
	So 1st we do meth method and show everithing, then static by name method in staticbyname
	calss print text things and do callme method in staticDemo. In static demo we have
	2 variables and callme methind so we do it and print s, then back to main method
	we ask for println and then variable d from staticdemo.
	*/
	
	
	static class StaticDemo{
		static int s=42;
		static int d=99;
		static void callme() {
			System.out.println("s= "+s);
		}
		
	}
	
	static class Staticbyname{
		static void StaticByname(){
		System.out.println("");
		System.out.println("Next static test.");
		StaticDemo.callme();
		}
	}
}


//just carcase of other prog that i merged here and do 1 prog from 2 

/*class StaticDemo{
 * static int z=42;
 * static int w=99;
 * 
 * static void callme(){
 * System.out.println("z= "+z);
 * }
 * }
 * 
 * class StaticByName{
 * public static void main(String args[]){
 * StaticDemo.callme();
 * System.out.println("w= "+StaticDemo.w);
 * }
 * }
*/
