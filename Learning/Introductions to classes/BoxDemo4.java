class Box{
  double width;
  double height;
  double depth;

//Now volume return volume of parallelogramm
  double volume(){
    return width * height * depth; //calculate and return volume
  }
}

class BoxDemo4{
  public static void main(String args[]){
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    //double vol;

    mybox1.width = 10;
    mybox1.height = 20;
    mybox1.depth = 15;

    mybox2.width = 3;
    mybox2.height = 6;
    mybox2.depth = 9;

    //vol = mybox1.volume();
    System.out.println("Volume is " + /*vol*/ mybox1.volume());

    //vol = mybox2.volume();
    System.out.println("Volume is " + /*vol*/ mybox2.volume());

  }
}
