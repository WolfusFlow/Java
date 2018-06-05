import MyPack.*;
public class TestBalance {
	public static void main(String args[]) {
		/*class balance defined as public so it can be used and called in construct*/
		Balance test = new Balance("J.J Jaspers", 99.88);
		test.show(); //we can call show method as well
	}
}
