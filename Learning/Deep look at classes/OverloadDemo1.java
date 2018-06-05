
public class OverloadDemo1 {
	void test() {
		System.out.println("No parametrs.");
	}
		
	//Overload method with two integer parameter
	void test(int a, int b) {
		System.out.println("a and b : "+ a +" "+ b);
	}
	
	//Overload method checking availability of double type parameter
	void test(double a) {
		System.out.println("internal conversion on call test(double) a: "+ a);		
	}
}
