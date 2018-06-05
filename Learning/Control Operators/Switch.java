import java.util.Scanner;

class Switch{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your month number: ");
    int month = in.nextInt();
    String season;
    switch (month) {
      case 12:
      case 1:
      case 2:
        season="Winter";
        break;
      case 3:
      case 4:
      case 5:
        season="Spring";
        break;
      case 6:
      case 7:
      case 8:
        season="Summer";
        break;
      case 9:
      case 10:
      case 11:
        season="Autumn";
        break;
      default:
      season="Your number isn't compare to a month numbers";
    }
    System.out.println("Your season number is a part of " + season +".");
  }
}
