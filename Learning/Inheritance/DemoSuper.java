
class Boxy{
	private double width;
	private double height;
	private double depth;
	
	//create clone of object
	Boxy (Boxy ob) { //get obj const
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	//construct when you know variables of size
	Boxy(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	//construct when we don't know variables
	Boxy(){
		width = -1;
		height = -1;
		depth = -1;
	}
	//construct when cube
	Boxy(double len){
		width = height = depth = len;
	}
	//calculate and return volume
	double volume() {
		return width*height*depth;
	}
}

//Now in class BoxWeight realized all constructs
class BoxyWeight extends Boxy{
	double weight; //weight of parallelepiped
	
	//construct clone of obj
	BoxyWeight(BoxyWeight ob){ //give obj to construct
		super (ob);
		weight = ob.weight;
	}
	
	//construct used when all parameters are known
	BoxyWeight(double w, double h, double d, double m){
		super (w,d,h); //call construct from superclass
		weight = m;
	}
	
	//default construct
	BoxyWeight(){
		super();
		weight = -1;
	}
	
	//construct for cube
	BoxyWeight(double len, double m){
		super (len);
		weight = m;
	}
}

public class DemoSuper {
	public static void main(String args[]) {
		BoxyWeight myboxy1 = new BoxyWeight(10, 20, 15, 34.3);
		BoxyWeight myboxy2 = new BoxyWeight(2, 3, 4, 0.076);
		BoxyWeight myboxy3 = new BoxyWeight(); //default
		BoxyWeight mycube = new BoxyWeight(3, 2);
		BoxyWeight myclone = new BoxyWeight(myboxy1);
		
		System.out.println("Volume of myboxy1 is " + myboxy1.volume());
		System.out.println("Wight of myboxy1 is " + myboxy1.weight);
		System.out.println();
		
		System.out.println("Volume of myboxy2 is " + myboxy2.volume());
		System.out.println("Wight of myboxy2 is " + myboxy2.weight);
		System.out.println();
		
		System.out.println("Volume of myboxy3 is " + myboxy3.volume());
		System.out.println("Wight of myboxy3 is " + myboxy3.weight);
		System.out.println();
		
		System.out.println("Volume of myclone is " + myclone.volume());
		System.out.println("Wight of myclone is " + myclone.weight);
		System.out.println();
		
		System.out.println("Volume of mycube is " + mycube.volume());
		System.out.println("Wight of mycube is " + mycube.weight);
		System.out.println();
	}

}
