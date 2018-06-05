
class Ternary{
  public static void main(String args[]){
    int i,k;
    i=10;
    k= i<0 ? -i : i;
    //Absolute value
    System.out.println("i value = " + i + "  Value of k is " + k);

    i=-10;
    k= i<0 ? -i : i;
    System.out.println("i value = " + i + "  Value of k is " + k);
  }
}
