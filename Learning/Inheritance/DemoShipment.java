class BoxShipment {
	
	private double width, height, depth;  
	
	//Standard parameters
	BoxShipment (double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	//Undefined
	BoxShipment (){
		width = -1;
		height = -1;
		depth = -1;
	}
	
	//Cube
	BoxShipment (double len){
		width = height = depth = len;		 
	}
	
	//Clone
	BoxShipment (BoxShipment ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	//Find volume
	 double volume() {
		 return width*height*depth;
	}
}

class BoxShipmentWeight extends BoxShipment{
	double weight;
	
	//Standard parameters with weight
	BoxShipmentWeight (double w, double h, double d, double m){
		super (w,h,d);		
		weight = m;
	}
	
	//Undefined
	BoxShipmentWeight (){
		super();
		weight =-1;
		}
		
		//Cube
	BoxShipmentWeight (double len, double m){
			super(len);
			weight = m;
		}
	
	//BoxiWeight clone
	BoxShipmentWeight (BoxShipmentWeight ob){
		super(ob);
		weight = ob.weight;
	}		
}

class Shipment extends BoxShipmentWeight{
	double cost;
			
	//clone
	Shipment(Shipment ob){
		super(ob);
		cost = ob.cost;
	}
	//all parameters
	Shipment(double w, double h, double d, double m, double c){
	    super(w,h,d,m);
	    cost=c;
	}
	//cube
    Shipment(double len, double m, double c){
		super(len,m);
		cost=c;
    }
	//Undefined
		Shipment(){
			super();
			cost=-1;
		}
}

public class DemoShipment {
	public static void main(String args[]) {
	    	Shipment shipment1 = new Shipment(10,20,15,10,3.41); 
	    	Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);
	    	
	    	System.out.println("Volume of shipment1 is: "+shipment1.volume());
	    	System.out.println("Weight of shipment1 is: "+shipment1.weight);
	    	System.out.println("Cost of shipment of shipment1 in $ is: "+shipment1.cost);
	    	System.out.println();
	    	System.out.println("Volume of shipment2 is: "+shipment2.volume());
	    	System.out.println("Weight of shipment2 is: "+shipment2.weight);
	    	System.out.println("Cost of shipment of shipment2 in $ is: "+shipment2.cost);
	}
}
