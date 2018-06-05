
class Boxi {
	
	protected double width, height, depth;  //protected open in package and subclasses
	
	//Standard parameters
	Boxi (double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	//Undefined
	Boxi (){
		width = -1;
		height = -1;
		depth = -1;
	}
	
	//Cube
	Boxi (double len){
		width = height = depth = len;		 
	}
	
	//Clone
	Boxi (Boxi ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	//Find volume
	 double volume() {
		 return width*height*depth;
	}
}

class BoxiWeight extends Boxi{
	double weight;
	
	//Standard parameters with weight
	BoxiWeight (double w, double h, double d, double m){
		super (w,h,d);		
		weight = m;
	}
	
	//Undefined
	BoxiWeight (){
		super();
		weight =-1;
		}
		
		//Cube
	BoxiWeight (double len, double m){
			super(len);
			weight = m;
		}
	
	//BoxiWeight clone
	BoxiWeight (BoxiWeight ob){
		super(ob);
		weight = ob.weight;
	}		
}

class Price extends BoxiWeight{
	double p, amount;
	double u = super.volume();
			
	//We ask BoxiWeight constructor about all parameters in it and add param for amount of items.
	Price (BoxiWeight ob, int a){
		super(ob);	
		amount = a;
		//Just a random formula for price calculating
		p = ((ob.width+ob.height+ob.depth)*ob.weight*a)/2;		
	}
	//Make price round and return
	double PriceProduct() {
		return Math.round(p);
	}	
}

class CostOfBoxi{
	public static void main(String args[]) {
		BoxiWeight myboxi = new BoxiWeight(3, 6, 8, 3.4);
		BoxiWeight myboxicube = new BoxiWeight(4, 6.2);
		BoxiWeight myboxi1 = new BoxiWeight();
		BoxiWeight myboxiclone = new BoxiWeight(myboxi);
		
	    System.out.println("The volume of myboxi is " + myboxi.volume() + " and the weight is " + myboxi.weight);
		System.out.println("The volume of myboxi1 is " + myboxi1.volume() + " and the weight is " + myboxi1.weight);
		System.out.println("The volume of myboxicube is " + myboxicube.volume() + " and the weight is " + myboxicube.weight);
		System.out.println("The volume of myboxiclone is " + myboxiclone.volume() + " and the weight is " + myboxiclone.weight);
		
		Price myprice = new Price(myboxi, 4);
		System.out.println("Your price for " + myprice.amount+" pieces is "+ myprice.PriceProduct());
		Price mypricecube = new Price(myboxicube, 6);
		System.out.println("Your price for " + mypricecube.amount+" pieces is "+ mypricecube.PriceProduct());
		System.out.println("Check the volume of myboxi throw myprice " + myprice.volume()+" and as variable "+myprice.u); 
	}
}
