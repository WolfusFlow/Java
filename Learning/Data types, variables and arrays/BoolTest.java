
// Demonstraition of boolean variables
class BoolTest{
   public static void main(String args[]){

   boolean b;

   b = false;
   System.out.println("b = " + b);
   b = true;
   System.out.println("b = " + b);

   //value of boolean can be control by if operator
   if(b) System.out.println("This code is compile.");
   b = false;
   if (b) System.out.println("This code is not compile.");

   //The result of comparison is - value of boolean
   System.out.println("10 > 9 equal " + (10 > 9));


   }

}
