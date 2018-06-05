
class FindPrime{
  public static void main(String args[])
  throws java.io.IOException{
    int num;
    boolean isPrime;
    System.out.println("Enter your number: ");
    num = (int) System.in.read();

    if(num<2) isPrime = false;
    else isPrime = true;

    for (int i = 2; i <= num/i; i++){
      if(( num % i)==0){
        isPrime=false;
        break;
      }
    }
    if(isPrime) System.out.println("Simple number");
    else System.out.println("Not a simple number");

  }
}
