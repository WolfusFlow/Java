
class IncDec{
   public static void main(String args[]){

     int a=1;       //x=42; y=++x -> y=42  |  x=42; y=x++ -> y=42
     int b=2;
     int c;
     int d;
     c= ++b;
     d= a++;
     c++;
     System.out.println("a = "+ a);
     System.out.println("b = "+ b);
     System.out.println("c = "+ c);
     System.out.println("d = "+ d);

   }
}
