
class Box {
	double up;
	double down;
	double inside;


	//calculate and return volume
	double volume() {
		return up*down*inside;
	}



	//set parameters for parallelogram
	void setDim(double u, double d, double i) {
		up = u;
		down = d;
		inside = i;
	}
}

class BoxPlay{
  public static void main(String args[]){

	Box newbox1 = new Box();
	Box newbox2 = new Box();
	boolean bool = true;

	while(bool) {

		for (int z=0; z<3; z++) {
		if (bool != true) break;
			if (z==1) bool=false;

			newbox1.setDim(3, 6, 8);
			newbox2.setDim(2, 4, 9);

	System.out.println("Volume is "+newbox1.volume());
	System.out.println("Volume is "+newbox2.volume());
	System.out.println("");

		}
	  }

  }
}
