//two-dimensional array
class ForEach3{
  public static void main(String args[]){
    int sum=0;
    int nums[][]=new int[3][5];

//initialize array
    for (int i=0; i<3; i++){
      for (int j=0; j<5; j++){
        nums [i][j]=(i+1)*(j+1);
      }
    }

    //using for each to output and sum values
    for (int x[]:nums){
      for (int y:x){
        System.out.println("Value is: "+y);
        sum += y;
      }
    }
    System.out.println("Sum: "+sum);

  }
}
