
class Box{
	double width;
	double height;
	double depth;
	
	//Take your attention on this construct
	//As a parameter here using object of Box type
	Box(Box ob){
		width = ob.width;
		height = ob.height; 
		depth = ob.depth;				
	}
	
	//Construct used when all parameters are known
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	//Construct used when no parameters are known
	Box(){
		width =-1;
		height=-1;
		depth=-1;
	}
	
	//Construct used while creating cube
	Box(double len){
		width=height=depth=len;
	}
	
	//Calculate volume
	double volume() {
		return width*height*depth;
	}
}

public class OverloadConstruct1 {
	public static void main(String args[]) {
		//Creating parallelepiped while using different onstructs
		Box mybox1 = new Box(10,20,15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);
		
		//Creating copy of mybox1 object
		Box myclone = new Box(mybox1);
		
		//Get volume of first parallelepiped
		System.out.println("Volume of mybox1 is " + mybox1.volume());
		
		//Get volume of second parallelepiped
		System.out.println("Volume of mybox2 is " + mybox2.volume());
				
		//Get volume of cube parallelepiped
		System.out.println("Volume of cube is " + mycube.volume());
				
		//Get volume of clone parallelepiped
		System.out.println("Volume of myclone is " + myclone.volume());
	}
}
