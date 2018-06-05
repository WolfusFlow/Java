
class finA{
 final void meth(){
 System.out.println("This is complete(final method");
 
 }
 }
 final class finB extends finA{
 //void meth()     Error! This method can't be redefined.
 //System.out.println("Unacceptable!");
 }
 //program can work faster because compiler know that method will not be redefine in future
 
 //make class final means all it's methods are final too if i remember correct
 
 
 //class finInh extends finB{}   Because you can't extend final class
/* boolean equals(finA finA) {
	 
 }*/
public class FinalInInheritance {
	public static void main() {
		finB finB = new finB();
		finB.meth();					
	}
}