//Calculates the distance traveled by light
//using long variable

class LongType {

 public static void main(String args[])
 {
     int lightspeed;
     long days, seconds, distance;

     //Approximate speed of light, miles per second
     lightspeed = 186000;

     days = 1000; //Quantity of days

     seconds = days * 24 * 60 * 60; //Transform to seconds

     distance = lightspeed * seconds; //Calculate distance

     System.out.print("For " + days);
     System.out.print(" days light going near ");
     System.out.println(distance + " miles.");
 }
}
