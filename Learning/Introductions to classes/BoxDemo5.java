
class Box {
	double width;
	double height;
	double depth;

	//calculate and return volume
	double volume() {
		return width*height*depth;
	}

	//set parameters for parallelogram
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}

class BoxDemo5{
  public static void main(String args[]){
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    //double vol;

    //initialize each element of Box class
    mybox1.setDim(10, 20, 15);
    mybox2.setDim(3, 6, 9);

    //get volume of 1st parallelogram
    /*vol=mybox1.volume();
    System.out.println("Volume is "+vol);

    vol=mybox2.volume();
    System.out.println("Volume is "+vol);
*/
    System.out.println("Volume is "+mybox1.volume());
    System.out.println("Volume is "+mybox2.volume());
  }
}
