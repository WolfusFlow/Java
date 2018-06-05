
abstract class FigureAbstr{
	double dim1,dim2;
	FigureAbstr(double a, double b){
	dim1=a; dim2=b;	
	}
	abstract double area(); //here is our abstract method
}
class RectangleAbstr extends FigureAbstr{
	RectangleAbstr(double a, double b){
		super(a,b);
	}
	double area() { //redefine abstract method for rectangle
		System.out.println("In the area of rectangle.");
		return dim1*dim2;
	}
}
class TriangleAbstr extends FigureAbstr{
	TriangleAbstr(double a, double b){
		super(a,b);
	}
	double area() { //redefine abstract method for a right triangle
		System.out.println("In the area of triangle.");
		return dim1*dim2/2;
	}
}
public class AbstractAreas {
	public static void main(String args[]) {
		//FigureAbstr a = new FigureAbstr(3,3); We can't do this because it's abstract
		//And we can't do abstract static methods and constructs
		RectangleAbstr R = new RectangleAbstr(10,8);
		TriangleAbstr T = new TriangleAbstr(6,8);
		FigureAbstr FigureAbstr; //It's correct but object wont be created
		
		FigureAbstr = R;
		System.out.println("The area is: "+FigureAbstr.area());
		
		FigureAbstr = T;
		System.out.println("The area is: "+FigureAbstr.area());
	}
}
