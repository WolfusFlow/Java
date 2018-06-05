
class ConvertionType {
 public static void main(String args[]){

   byte b;
   int i=257;
   double d=323.142;
   System.out.println("\nConvertion int type to byte.");
   b=(byte) i;
   System.out.println("i and b "+i+" " +b);

   System.out.println("\nConvertion double type to int");
   i=(int) d;
   System.out.println("i and d "+i+" " +d);

   System.out.println("\nConvertion double type to byte");
   b=(byte) d;
   System.out.println("b and d "+b+" " +d);

 }

}
