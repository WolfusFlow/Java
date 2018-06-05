import java.util.Scanner;  //usage of input

class IfElse{
  public static void main(String args[]){

    Scanner in = new Scanner(System.in);  //input from keyboard
    System.out.println("Enter your month number: ");
    int month = in.nextInt(); //Your number as month

    String season;
    if (month == 12 || month == 1 || month == 2)
      season = "Winter";
    else if (month == 3 || month == 4 || month == 5)
      season = "Spring";
    else if (month == 6 || month == 7 || month == 8)
      season = "Summer";
    else if (month == 9 || month == 10 || month == 11)
      season = "Autumn";
    else season = "Imagined month";
    System.out.println("Your is a month is a part of " + season);
  }
}
