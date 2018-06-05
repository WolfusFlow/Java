
//In this example constructs are determined in class Box for
//initialization the dimensions of parallelepiped with 3 different cases
class Boxy{
	double width;
	double height;
	double depth;
	
	//Construct used when all parameters are known
	Boxy(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	//Construct used when no parameters are known
	Boxy(){
		width =-1;   //-1 used for designation of uninitialized parallelepiped
		height =-1;
		depth =-1;
	}
	
	//Construct used when cube is creating
	Boxy(double len){
		width = height = depth = len;
	}
	
	//Calculate and return volume
	double volume() {
		return width*height*depth;
	}
}


public class OverloadConstruct {
	public static void main(String args[]) {
		//Creating parallelepipeds with different constructs
		Boxy mybox1 = new Boxy(10,20,15);
		Boxy mybox2 = new Boxy();
		Boxy mybox3 = new Boxy(7);
		
		//Get volume of the first parallelepiped
		System.out.println("Volume of mybox1 is "+mybox1.volume());
		
		//Get volume of the second parallelepiped
		System.out.println("Volume of mybox1 is "+mybox2.volume());
				
		//Get volume of the third parallelepiped
		System.out.println("Volume of mybox1 is "+mybox3.volume());
	}
}
