class Box{
  double width;
  double height;
  double depth;

  //Here we use method in box class
  void volume(){
    System.out.print("Volume is ");
    System.out.println(width * height * depth);
  }
}

class BoxDemo3{
  public static void main(String args[]){
    Box mybox1 = new Box();
    Box mybox2 = new Box();

    //assign values for variables in mybox exemplars
    mybox1.width = 10;
    mybox1.height = 20;
    mybox1.depth = 15;

    mybox2.width = 3;
    mybox2.height = 6;
    mybox2.depth = 9;

    //out volume of 1st parallelepiped
    mybox1.volume();    

    //out volume of 2nd parallelepiped
    mybox2.volume();

  }
}
