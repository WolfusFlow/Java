
class Literal {
 public static void main (String args[]){

  long x;
   x=0x6993A6CFF202C137l;

   int y = 0b1010;
System.out.println(x  + y); //summ of x in hex and y in bin
System.out.println(123_456_789);//underscoring is ignoring. Can't use them in the beginning or end of value

int z=0b1101_0101_0001_1010; //54554
double d=0x12.2P2;  //72,5
System.out.println(z);
System.out.println(d);

  char a = '\u0061';
  char b = '\ua432'; //Japan katakana
  char c = '\'';
  System.out.println(a + "  " + b + "  " + c);

 }

}
