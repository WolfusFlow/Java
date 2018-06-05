
class ForEach{
  public static void main(String args[]){
    int nums[]={1,2,3,4,5,6,7,8,9,10};
    int sum=0;
    //now we ll use for each for reading values and sum them
    for (int x : nums){
      System.out.println("Value is: "+x);
      sum+=x;
    }
    System.out.println("Sum of elements: "+sum);

  }
}
