
//Inheriting for extending box class
class Box{
	double width;
	double height;
	double depth;
	
	//Create a construct of object's clone
	Box(Box Ob){
		width = Ob.width;
		height = Ob.height;
		depth = Ob.depth;		
	}
	//Create a construct when we know all variables
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	//Construct when we don't know variables
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}
	//Construct for cube
	Box(double len){
		width = height = depth = len;
	}
	//Calculate and return volume
	double volume(){
		return width*height*depth;
	}
}

//Extends Box class by adding weight fields
class BoxWeight extends Box{
	double weight;
	
	//Construct BoxWeight()
	BoxWeight(double w, double h, double d, double m){
		width = w;
		height = h;
		depth = d;
		weight = m;		
	}	
}

public class DemoBoxWeight {
	public static void main(String args[]) {
		BoxWeight mybox1= new BoxWeight(10,15,20,34.5);
		BoxWeight mybox2= new BoxWeight(3,5,7,0.076);
				
		System.out.println("Volume of mybox1 is "+mybox1.volume());
		System.out.println("Weight of mybox1 is "+mybox1.weight);
		System.out.println();
		
		System.out.println("Volume of mybox2 is "+mybox2.volume());
		System.out.println("Weight of mybox2 is "+mybox2.weight);
		System.out.println();
	}
}

class ColorBox extends Box {
	int color;
	
	ColorBox(double w, double h, double d, int c){
		width = w;
		height = h;
		depth = d;
		color = c;		
	}
}
