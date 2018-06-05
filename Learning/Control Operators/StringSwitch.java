import java.util.Scanner; //input of a string line

class StringSwitch{
  public static void main(String args[]){

    Scanner input = new Scanner(System.in);
    System.out.println("Choose your number from 1 to 3 and write down it's string variation, without capital. Check for matches.");
    String str = input.nextLine();

    switch (str){
      case "one":
        System.out.println("one. You found a match!");
        break;
      case "two":
        System.out.println("two. You found a match!");
        break;
      case "three":
        System.out.println("three. You found a match!");
        break;
      default:
         System.out.println("No match, sry try again if you want.");
    }
  }
}
