
//Another recursion example
class RecTest{
	int values[];
	
	RecTest(int i){
		values = new int[i];
	}
	
	//Derive the recursive elements of an array
	void printArray(int i) {
		if(i==0) return;  //exiting method | return give control to the object, which called this method to "else printArray(i-1);" where i = 1.
		else printArray(i-1);
		System.out.println("["+(i-1)+"] "+values[i-1]);
	}
}

public class Recursion1 {
	public static void main(String args[]) {
		RecTest ob = new RecTest(10);
				
		for (int i=0; i<10;i++) {
			ob.values[i] = i;			
		}
		ob.printArray(10);
	}
}
