
public class OverloadDemo {
	void test() {
		System.out.println("No parametrs.");
	}
	
	//Overload method with integer parameter
	void test(int a) {
		System.out.println("a: "+a);
	}
	
	//Overload method with two integer parameter
	void test(int a, int b) {
		System.out.println("a and b : "+ a +" "+ b);
	}
	
	//Overload method checking availability of double type parameter
	double test(double a) {
		System.out.println("double a: "+ a);
		return a*a;
	}
}
