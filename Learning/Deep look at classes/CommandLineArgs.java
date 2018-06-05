
//Output all arguments of command line
public class CommandLineArgs {
	public static void main(String args[]) {
		for (int i=0; i<args.length; i++)
			System.out.println("args["+i+"]: "+args[i]);
		//In folder with class - Open command line, then
		//Input into terminal -> java CommandLineArgs this is a test 100 -1				
	}
}
