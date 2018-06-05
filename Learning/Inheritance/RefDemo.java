
public class RefDemo {
	public static void main(String args[]) {
		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();
		double vol;
		
		vol=weightbox.volume();
		System.out.println("Volume of weightbox is "+vol);
		System.out.println("The weight is "+weightbox.weight);
		System.out.println();
		
		//Assign a reference to the object BoxWeight to a reference to the Box object
		plainbox = weightbox;
		vol = plainbox.volume(); //Correct because method volume() is defined in Box class
		System.out.println("The volume of plainbox is "+vol);
		
		/*The next operator is Incorrect because 
		 * member plainbox not wasn't defined member weight/*
		 */
		//System.out.println("Weight of plainbox is "+plainbox.weight);
	}
}
