/*
Check how if operator works
*/
class IfSample {

public static void main(String args[])
{

 int x,y;

  x = 10;
  y = 20;

if (x < y) System.out.println("x less then y");

x = x * 2;
if (x == y) System.out.println("now x equal to y");

x = x * 2;
if (x > y) System.out.println("now x more then y");

//This operator will display nothing
if (x == y) System.out.println("You will not see this");
}

}
