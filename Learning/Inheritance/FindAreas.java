
class Figure{
	double dim1,dim2;
	
	Figure(double a, double b){
		dim1=a;
		dim2=b;
	}
	double area(){
		System.out.println("Figure is not define");
		return 0;
	}
}
class Rectangle extends Figure{
	
	Rectangle(double a, double b){
		super(a,b);
	}
	//redefinition of area for rectangle
	double area(){
		System.out.println("In the area of rectangle ");
		return dim1*dim2;
	}
	
}
class Triangle extends Figure{
	
	Triangle(double a, double b){
		super(a,b);		
	}
	//redefinition of area for a right-angled triangle
	double area() {
		System.out.println("In the area of triangle ");
		return dim1*dim2/2;
	}
}
public class FindAreas {
	public static void main(String args[]) {
		Figure F = new Figure(10,20);
		Rectangle R = new Rectangle(9,6);
		Triangle T = new Triangle(10,8);
		Figure Figref;
		
		Figref = R;
		System.out.println("The area is "+Figref.area());
		
		Figref = T;
		System.out.println("The area is "+Figref.area());
		
		Figref = F;
		System.out.println("The area is "+Figref.area());
	}
}
