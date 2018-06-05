//Upgraidet version of Box class is in next BoxDemos. I think I should just use other file for class Box, but i'm lazy

class Box{
  double width;
  double height;
  double depth;
}

class BoxDemo{
  public static void main(String args[]){
    Box mybox = new Box();
    double vol;
    //assign a value to instance variables
    mybox.width = 10;
    mybox.height = 20;
    mybox.depth = 15;

    //calculate the volume of a parallelepiped
    vol=mybox.width*mybox.height*mybox.depth;
    System.out.println("The volume is "+vol);

  }
}
