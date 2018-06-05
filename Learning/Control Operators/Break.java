
//form of operator break as goto
class Break{
  public static void main(String args[]){
    boolean t = true;

    first: {
      second: {
        third: {
          System.out.println("Priviously then break operator.");
          if (t) break second;  //exit out from second block
          System.out.println("This operator won work");
        }
        System.out.println("This operator won work");
      }
      System.out.println("This operator should be after block \"second\"");
    }

  }
}
