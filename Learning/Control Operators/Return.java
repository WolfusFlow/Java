class Return{
  public static void main(String args[]){
    boolean t=true;

    System.out.println("Before return");
    if (t) return; //Return in call code   //unreachable so we use if for trick the compiler

    System.out.println("This operator will not work");
  }
}
