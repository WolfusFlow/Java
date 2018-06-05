
public class Box {
	double width;
	double height;	
	double depth;
	
	//this is a parameterized constructor of Box class	
	Box(double w, double h, double d) {
		//System.out.println("Construction Box object");  | just to show the construct work 
		this.width = w; //using of this word. Reference to the calling method
		height = h;
		depth = d;	
	}
	//in this example, a conflict in the namespace is resolved
	/*Box(double width, double height, double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}*/
	
	//calculate and return volume
	double volume() {
		return width*height*depth;
	}
}


//Box mybox1 = new Box()  | Box() - Construct of Box
//it means that default construct are not usable now because we use Box() construct in our class
